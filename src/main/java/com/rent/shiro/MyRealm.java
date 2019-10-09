package com.rent.shiro;

import com.rent.dao.SysUserRepository;
import com.rent.domain.SysUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author 贾振乾
 * Date 2019/9/28
 * Time 11:09
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken userToken) throws AuthenticationException {
        String loginName=(String)userToken.getPrincipal();

        SysUser sysUser =sysUserRepository.findByLoginName(loginName);
        System.out.println("=====>"+sysUser);

        SimpleAuthenticationInfo simpleAuthenticationInfo=
                new SimpleAuthenticationInfo(loginName,sysUser.getPassword(),getName());

        return simpleAuthenticationInfo;
    }
}
