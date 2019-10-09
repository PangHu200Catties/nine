package com.rent.dao;

import com.rent.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author 贾振乾
 * Date 2019/9/28
 * Time 11:16
 */

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findByLoginName(String loginName);
}
