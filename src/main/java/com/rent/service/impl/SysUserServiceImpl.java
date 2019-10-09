package com.rent.service.impl;


import com.rent.dao.SysUserRepository;
import com.rent.domain.SysUser;
import com.rent.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author 贾振乾
 * Date 2019/9/25
 * Time 11:14
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser findByLoginName(String loginName) {
        return sysUserRepository.findByLoginName(loginName);
    }


}
