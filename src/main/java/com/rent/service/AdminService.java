package com.rent.service;

import com.rent.domain.Admin;

/**
 * @author: 陈琪文
 * @description: com.rent.service
 * @date: 2019/10/8
 * @time: 16:25
 */
public interface AdminService {

    Admin findByAusernameAndByApassword(Admin admin);
}
