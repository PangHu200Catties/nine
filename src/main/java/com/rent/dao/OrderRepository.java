package com.rent.dao;

import com.rent.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author 贾振乾
 * Date 2019/9/28
 * Time 11:16
 */

public interface OrderRepository extends JpaRepository<Order,Integer> {

    Order findByOrderCode(String orderCode);

    List<Order> findByUserId(Integer userId);

}
