package com.rent.service.impl;

import com.rent.dao.HouseMyRepository;
import com.rent.domain.House;
import com.rent.service.HouseService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:23
 * @description:
 */
@Service
public class HouseServiceImpl implements HouseService {


    @Autowired
    private HouseMyRepository houseMyRepository;


    @Override
    public PageBean listAllHouse(int page, int size) {
        PageRequest of = PageRequest.of(page-1, size);
        Page<House> all = houseMyRepository.findAll(of);
        PageBean housePageBean = new PageBean();
        housePageBean.setList(all.getContent());
        housePageBean.setTotal(all.getTotalElements());
        return housePageBean;
    }
}
