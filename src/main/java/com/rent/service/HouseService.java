package com.rent.service;

import com.rent.domain.House;
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

    PageBean<House> endfindHouseByHstatus(int status, int currentpage, int pagesize);

    void enddeletehouse(int hid);

    House endfindbyhouse(int hid);

    void endupdatebyhouse(House hh);

    PageBean<House> findBySearch(String search, int status, int currentpage, int pagesize);
    House findByHid(Integer hid);
}
