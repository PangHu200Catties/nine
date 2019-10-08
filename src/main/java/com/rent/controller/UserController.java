package com.rent.controller;

import com.rent.domain.User;
import com.rent.service.UserService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈琪文
 * @description: com.rent.controller
 * @date: 2019/10/7
 * @time: 14:33
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /*@RequestMapping("/endfinduser/{currentPage}/{pagesize}")
    public PageBean<User> endfindUserByPage(@PathVariable("currentPage")int currentpage, @PathVariable("pagesize")int pagesize){
        return userService.endfindUserByPage(currentpage,pagesize);
    }*/

    @RequestMapping("/endfinduser/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endfindUserByUstatus(@PathVariable("ustatus") int ustatus,@PathVariable("currentPage")int currentpage,
                                               @PathVariable("pagesize")int pagesize){
        return userService.endfindUserByUstatus(ustatus,currentpage,pagesize);
    }

    @RequestMapping("/enddeleteuser/{uid}")
    public void enddeleteuser(@PathVariable("uid")int uid){
        userService.enddeleteuser(uid);
    }

    @RequestMapping("/endsearchuser/{search}/{ustatus}/{currentPage}/{pagesize}")
    public PageBean<User> endsearchuser(@PathVariable("search")String search,@PathVariable("ustatus")int ustatus,
                                        @PathVariable("currentPage")int currentpage,@PathVariable("pagesize")int pagesize){
        return userService.findBySearch(search,ustatus,currentpage,pagesize);
    }
}
