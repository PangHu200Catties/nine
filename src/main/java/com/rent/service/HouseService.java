package com.rent.service;

import com.rent.utils.PageBean;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:19
 * @description:
 */
public interface HouseService {
    //分页查所有
    PageBean listAllHouse(int page, int size);

}
