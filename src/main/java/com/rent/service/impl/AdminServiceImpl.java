package com.rent.service.impl;

import com.rent.dao.AdminReponsitory;
import com.rent.domain.Admin;
import com.rent.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 陈琪文
 * @description: com.rent.service.impl
 * @date: 2019/10/8
 * @time: 16:27
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminReponsitory adminReponsitory;

    @Override
    public Admin findByAusernameAndByApassword(Admin admin) {
        return adminReponsitory.findByAusernameAndApassword(admin.getAusername(),admin.getApassword());
    }
}
