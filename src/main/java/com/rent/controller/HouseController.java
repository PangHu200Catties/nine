package com.rent.controller;

import com.rent.domain.House;
import com.rent.dao.HouseMyRepository;
import com.rent.domain.House;
import com.rent.service.HouseService;
import com.rent.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import com.rent.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    @Resource
    private HouseMyRepository houseMyRepository;
    @Resource
    private UploadUtils uploadUtils;
    @RequestMapping("/hListAll/{page}/{size}")
    public PageBean hListAllHouse(@PathVariable("page") int page, @PathVariable("size") int size){
        PageBean housePageBean = houseService.listAllHouse(page, size);
        return housePageBean;
    }
    @RequestMapping("/hSearch")
    @ResponseBody
    public PageBean listHouses(@RequestBody PageBean pageBean){

        System.out.println(pageBean);
        return houseService.ListHouseByAddress(pageBean);
    }
    //根据出租类型查询并分页展示
    @RequestMapping("/endfindhouse/{status}/{currentPage}/{pagesize}")
    public PageBean<House> endfindHouseByUstatus(@PathVariable("status") int status, @PathVariable("currentPage")int currentpage,
                                                 @PathVariable("pagesize")int pagesize, HttpServletRequest request){
        if(request.getSession().getAttribute("aa")!=null) {
            return houseService.endfindHouseByHstatus(status, currentpage, pagesize);
        }
        return null;
    }
    //删除房屋信息
    @RequestMapping("/enddeletehouse/{hid}")
    public void enddeletehouse(@PathVariable("hid") int hid){
        houseService.enddeletehouse(hid);
    }
    //修改房屋状态
    @RequestMapping("/endupdatebyhouse/{hid}")
    public void endupdatebyhouse(@PathVariable("hid") int hid){
        House hh = houseService.endfindbyhouse(hid);
        hh.setStatus(1);
        houseService.endupdatebyhouse(hh);
    }
    //房屋模糊查询并分页展示
    @RequestMapping("/endsearchhouse/{search}/{status}/{currentPage}/{pagesize}")
    public PageBean<House> endsearchhouse(@PathVariable("search")String search,@PathVariable("status")int status,
                                        @PathVariable("currentPage")int currentpage,@PathVariable("pagesize")int pagesize,
                                          HttpServletRequest request){
        if(request.getSession().getAttribute("aa")!=null) {
            return houseService.findBySearch(search, status, currentpage, pagesize);
        }
        return null;
    }
    //根据id查询房屋所以信息
    @RequestMapping("/endfindpicbyhid/{hid}")
    public House endfindpicbyhid(@PathVariable("hid") int hid){
        return houseService.endfindbyhouse(hid);
    }

    @RequestMapping("/findByHid")
    @ResponseBody
    public House findByHid(@RequestBody House house){
        System.out.println(house.getHid());
        Integer hid=house.getHid();
        House byHid = houseService.findByHid(hid);
        System.out.println(byHid);
        return byHid;

    }

    @RequestMapping("/findAll")
    public List<House> findAll()  {

        return houseService.findAll();
    }
//房东房屋信息修改
    @PostMapping("/selectById")
    public House selectById(@RequestBody House house) {
        System.out.println(house.getHid()+"==============================");
        return houseService.selectById(house);

    }

    @RequestMapping(value = "/updateData",method = RequestMethod.POST)
    public void updateData(@RequestBody House house){
         houseService.updateData(house);
    }

    @RequestMapping(value = "/uploadpic",method = RequestMethod.POST)
    public String uploadpic(MultipartFile file) {
            return uploadUtils.upload(file);
    }

}
