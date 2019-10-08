package com.rent.service.impl;

import com.rent.dao.UserMapper;
import com.rent.dao.UserReponsitory;
import com.rent.domain.Admin;
import com.rent.domain.User;
import com.rent.service.UserService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 陈琪文
 * @description: com.rent.service.impl
 * @date: 2019/10/7
 * @time: 14:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserReponsitory userReponsitory;

    @Override
    public PageBean<User> endfindUserByPage(int currentPage, int pagesize) {
        Pageable pp=PageRequest.of(currentPage-1,pagesize);
        Page<User> all = userReponsitory.findAll(pp);
        PageBean pageBean=new PageBean();
        pageBean.setList(all.getContent());
        pageBean.setTotal(all.getTotalElements());
        return pageBean;
    }

    @Override
    public PageBean<User> endfindUserByUstatus(int ustatus,int currentPage, int pagesize) {
        Pageable pp=PageRequest.of(currentPage-1,pagesize);
        Page<User> all = userReponsitory.findByUstatus(ustatus,pp);
        PageBean pageBean=new PageBean();
        pageBean.setList(all.getContent());
        System.out.println(all.getContent());
        pageBean.setTotal(all.getTotalElements());
        return pageBean;
    }

    @Override
    public void enddeleteuser(int uid) {
        userReponsitory.deleteById(uid);
    }

    @Override
    public PageBean<User> findBySearch(String search,int ustatus, int currentpage, int pagesize) {
        Pageable pp1=PageRequest.of(currentpage-1,pagesize);
        Page real = userReponsitory.findByRealnameContainingAndUstatus(search,ustatus,pp1);
        PageBean pageBean=new PageBean();
        pageBean.setList(real.getContent());
        pageBean.setTotal(real.getTotalElements());
        return pageBean;
    }

}
