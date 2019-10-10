package com.rent.service.impl;

import com.rent.dao.HouseMyRepository;
import com.rent.domain.House;
import com.rent.service.HouseService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public PageBean<House> endfindHouseByHstatus(int status, int currentpage, int pagesize) {
        PageRequest pp = PageRequest.of(currentpage-1, pagesize);
        Page<House> all = houseMyRepository.findByStatus(status,pp);
        PageBean housePageBean = new PageBean();
        housePageBean.setList(all.getContent());
        housePageBean.setTotal(all.getTotalElements());
        return housePageBean;
    }

    @Override
    public void enddeletehouse(int hid) {
        houseMyRepository.deleteById(hid);
    }

    @Override
    public House endfindbyhouse(int hid) {
       return houseMyRepository.findByHid(hid);
    }

    @Override
    public void endupdatebyhouse(House hh) {
        houseMyRepository.saveAndFlush(hh);
    }

    @Override
    public PageBean<House> findBySearch(String search,int status, int currentpage, int pagesize) {
        Pageable pp1=PageRequest.of(currentpage-1,pagesize);
        Page real = houseMyRepository.findByHtitleContainingAndStatus(search,status,pp1);
        PageBean pageBean=new PageBean();
        pageBean.setList(real.getContent());
        System.out.println(real.getContent());
        pageBean.setTotal(real.getTotalElements());
        return pageBean;
    }




    @Override
    public House findByHid(Integer hid) {
        Optional<House> byId = houseMyRepository.findById(hid);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            return null;
        }
    }
}
