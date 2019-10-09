package com.rent.service;


import com.rent.domain.SysUser;

/**
 * Author 贾振乾
 * Date 2019/9/25
 * Time 11:13
 */
public interface SysUserService {

    SysUser findByLoginName(String loginName);
}
