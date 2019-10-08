package com.rent.dao;

import com.rent.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author: 陈琪文
 * @description: com.rent.dao
 * @date: 2019/10/7
 * @time: 14:20
 */
@Component
public interface AdminReponsitory extends JpaRepository<Admin,Integer> {

    Admin findByAusernameAndApassword(String ausername,String apassword);

}
