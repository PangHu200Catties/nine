package com.rent.service.impl;

import com.rent.dao.OrderRepository;
import com.rent.domain.Order;
import com.rent.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author 贾振乾
 * Date 2019/10/11
 * Time 14:48
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order findByOrderCode(String orderCode) {
        return orderRepository.findByOrderCode(orderCode);
    }

    @Override
    public void saveAndFlush(Order order) {
        orderRepository.saveAndFlush(order);
    }


}
