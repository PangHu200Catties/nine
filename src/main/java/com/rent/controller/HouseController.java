package com.rent.controller;

import com.rent.domain.House;
import com.rent.service.HouseService;
import com.rent.utils.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:01
 * @description:
 */
@RestController
public class HouseController {

    @Resource
    private HouseService houseService;

    @RequestMapping("/hListAll/{page}/{size}")
    public PageBean hListAllHouse(@PathVariable("page") int page, @PathVariable("size") int size){
        PageBean housePageBean = houseService.listAllHouse(page, size);
        return housePageBean;
    }
    //根据出租类型查询并分页展示
    @RequestMapping("/endfindhouse/{status}/{currentPage}/{pagesize}")
    public PageBean<House> endfindHouseByUstatus(@PathVariable("status") int status, @PathVariable("currentPage")int currentpage,
                                                @PathVariable("pagesize")int pagesize){
        return houseService.endfindHouseByHstatus(status,currentpage,pagesize);
    }

    @RequestMapping("/enddeletehouse/{hid}")
    public void enddeletehouse(@PathVariable("hid") int hid){
        houseService.enddeletehouse(hid);
    }

    @RequestMapping("/endupdatebyhouse/{hid}")
    public void endupdatebyhouse(@PathVariable("hid") int hid){
        House hh = houseService.endfindbyhouse(hid);
        hh.setStatus(1);
        houseService.endupdatebyhouse(hh);
    }
    @RequestMapping("/endsearchhouse/{search}/{status}/{currentPage}/{pagesize}")
    public PageBean<House> endsearchhouse(@PathVariable("search")String search,@PathVariable("status")int status,
                                        @PathVariable("currentPage")int currentpage,@PathVariable("pagesize")int pagesize){
        return houseService.findBySearch(search,status,currentpage,pagesize);
    }
}
