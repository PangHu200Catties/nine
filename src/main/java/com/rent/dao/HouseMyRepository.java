package com.rent.dao;

import com.rent.domain.House;
import com.rent.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:06
 * @description:
 */
public interface HouseMyRepository extends JpaRepository<House,Integer> {
    Page<House> findByStatus(int status, Pageable pageable);

    Page<House> findByHtitleContainingAndStatus(String htitle,int status,Pageable pageable);

    House findByHid(int hid);
}
