package com.rent.controller;

import com.rent.domain.Admin;
import com.rent.domain.User;
import com.rent.service.AdminService;
import com.rent.service.UserService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    //登录验证
    @RequestMapping("/endlogin")
    public String endlogin(@RequestBody Admin admin ){
        Admin aa = adminService.findByAusernameAndByApassword(admin);
        if(aa==null){
            return "{\"topage\": \"end_login\",\"alertto\": \"登录失败\"}";
        }else {
            return "{\"topage\": \"end_index\",\"alertto\": \"登录成功\"}";
        }
    }
    //根据用户类型查询并分页展示
    @RequestMapping("/endfinduser/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endfindUserByUstatus(@PathVariable("ustatus") int ustatus,@PathVariable("currentPage")int currentpage,
                                               @PathVariable("pagesize")int pagesize){
        return userService.endfindUserByUstatus(ustatus,currentpage,pagesize);
    }
    //删除用户信息
    @RequestMapping("/enddeleteuser/{uid}")
    public void enddeleteuser(@PathVariable("uid")int uid){
        userService.enddeleteuser(uid);
    }
    //按真实姓名搜索用户并分页展示
    @RequestMapping("/endsearchuser/{search}/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endsearchuser(@PathVariable("search")String search,@PathVariable("ustatus")int ustatus,
                                        @PathVariable("currentPage")int currentpage,@PathVariable("pagesize")int pagesize){
        return userService.findBySearch(search,ustatus,currentpage,pagesize);
    }

}
