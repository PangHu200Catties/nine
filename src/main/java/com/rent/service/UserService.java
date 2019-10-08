package com.rent.service;

import com.rent.domain.Admin;
import com.rent.domain.User;
import com.rent.utils.PageBean;

/**
 * @author: 陈琪文
 * @description: com.rent.service
 * @date: 2019/10/7
 * @time: 14:06
 */
public interface UserService {
    PageBean endfindUserByPage(int currentPage,int pagesize);

    void enddeleteuser(int uid);

    PageBean<User> findBySearch(String search,int ustatus, int currentpage, int pagesize);

    PageBean<User> endfindUserByUstatus(int ustatus,int currentPage, int pagesize);

}
