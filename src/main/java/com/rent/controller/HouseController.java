package com.rent.controller;

import com.rent.service.HouseService;
import com.rent.utils.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:01
 * @description:
 */
@Controller
public class HouseController {

    @Resource
    private HouseService houseService;

    @RequestMapping("/hListAll/{page}/{size}")
    @ResponseBody
    public PageBean hListAllHouse(@PathVariable("page") int page, @PathVariable("size") int size){
        PageBean housePageBean = houseService.listAllHouse(page, size);
        return housePageBean;
    }

}
