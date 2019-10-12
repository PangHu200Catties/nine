package com.rent.service;

import com.rent.domain.Order;

/**
 * Author 贾振乾
 * Date 2019/10/11
 * Time 14:47
 */
public interface OrderService {
    public void save(Order order);

    public Order findByOrderCode(String orderCode);

    public void saveAndFlush(Order order);
}
