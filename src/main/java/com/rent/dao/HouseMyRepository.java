package com.rent.dao;

import com.rent.domain.House;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:06
 * @description:
 */
public interface HouseMyRepository extends JpaRepository<House,Integer> {
}
