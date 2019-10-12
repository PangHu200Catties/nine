package com.rent.controller;

import com.rent.domain.Admin;
import com.rent.domain.SysUser;
import com.rent.domain.User;
import com.rent.service.AdminService;
import com.rent.service.SysUserService;
import com.rent.service.UserService;
import com.rent.utils.PageBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: 陈琪文
 * @description: com.rent.controller
 * @date: 2019/10/7
 * @time: 14:33
 */
@RestController
public class UserController {
    @Resource
    private AdminService adminService;

    @Autowired
    private UserService userService;
    @Autowired
    private SysUserService sysUserService;

    //登录验证
    /*@RequestMapping("/endlogin")
    public String endlogin(@RequestBody Admin admin,HttpServletRequest request ){
        Admin aa = adminService.findByAusernameAndByApassword(admin);
        if(aa==null){
            return "{\"topage\": \"end_login\",\"alertto\": \"登录失败\"}";
        }else {
            HttpSession session=request.getSession();
            session.setAttribute("aa",aa);
            return "{\"topage\": \"end_index\",\"alertto\": \"登录成功\"}";
        }
    }*/
    //登录用户信息
    @RequestMapping("/endfindusername")
    public String endfindusername(HttpServletRequest request ){
        HttpSession session=request.getSession();
        SysUser aa = (SysUser)session.getAttribute("token");
        if(aa==null){
            return "登录";
        }
        return aa.getLoginName();
    }
    //注销
    @RequestMapping("/endlogout")
    public void endlogout(HttpServletRequest request ){
        HttpSession session=request.getSession();
        session.removeAttribute("token");
    }
    //根据用户类型查询并分页展示
    @RequestMapping("/endfinduser/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endfindUserByUstatus(@PathVariable("ustatus") int ustatus,@PathVariable("currentPage")int currentpage,
                                               @PathVariable("pagesize")int pagesize,HttpServletRequest request){
        if(request.getSession().getAttribute("token")!=null){
            return userService.endfindUserByUstatus(ustatus,currentpage,pagesize);
        }
        return null;
    }
    //删除用户信息
    @RequestMapping("/enddeleteuser/{uid}")
    public void enddeleteuser(@PathVariable("uid")int uid){
        userService.enddeleteuser(uid);
    }
    //按真实姓名搜索用户并分页展示
    @RequestMapping("/endsearchuser/{search}/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endsearchuser(@PathVariable("search")String search,@PathVariable("ustatus")int ustatus,
                                        @PathVariable("currentPage")int currentpage,@PathVariable("pagesize")int pagesize,
                                        HttpServletRequest request){
        if(request.getSession().getAttribute("token")!=null) {
            return userService.findBySearch(search, ustatus, currentpage, pagesize);
        }
        return null;
    }

    @RequestMapping("/sysuserLogin")
    public String sysuserLogin(@RequestBody SysUser sysUser,HttpServletRequest request){

        SysUser sysUser1=sysUserService.findByLoginName(sysUser.getLoginName());
//        System.out.println(sysUser1.getStatus());

        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken userToken=new UsernamePasswordToken(sysUser.getLoginName(),sysUser.getPassword());
        try{
            subject.login(userToken);
            if(subject.isAuthenticated()&1==sysUser1.getStatus()){
                /*HttpSession session=request.getSession();
                session.setAttribute("userToken",userToken);*/
                return "登录成功";
            }else{
                return "登录失败";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "登录失败";
    }


    @RequestMapping("/sysAdminLogin")
    public String sysAdminLogin(@RequestBody SysUser sysUser,HttpServletRequest request){
        System.out.println(sysUser);
        System.out.println("=====>sysAdminLogin");

        SysUser sysUser1=sysUserService.findByLoginName(sysUser.getLoginName());

        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(sysUser.getLoginName(),sysUser.getPassword());
        try{
            subject.login(token);
            if(subject.isAuthenticated()&&2==sysUser1.getStatus()){
                HttpSession session=request.getSession();
                session.setAttribute("token",token);
                return "登录成功";
            }else{
                return "登录失败";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "登录失败";
    }

    @RequestMapping("/endfinduserbyid/{uid}")
    public User endfinduserbyid(@PathVariable("uid") int uid){
        return userService.endfinduserbyid(uid);
    }

    @RequestMapping("/findByUid")
    public User findByUid(@RequestBody User user) {
        Integer uid = user.getUid();
        System.out.println(user.getUid());
        User byUid = userService.findByUid(uid);
        return byUid;
    }
}
