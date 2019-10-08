package com.rent.dao;

import com.rent.domain.User;
import com.rent.utils.PageBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author: 陈琪文
 * @description: com.rent.dao
 * @date: 2019/10/7
 * @time: 14:20
 */
@Component
public interface UserReponsitory extends JpaRepository<User,Integer> {

    Page<User> findByRealnameContainingAndUstatus(String realname,int ustatus,Pageable pageable);

    Page<User> findByUstatus(int ustatus,Pageable pageable);

}
