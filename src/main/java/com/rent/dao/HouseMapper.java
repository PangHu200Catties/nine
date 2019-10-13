package com.rent.dao;

import com.rent.domain.House;
import com.rent.utils.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface HouseMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    List<House> selectByAddress(PageBean pageBean);

    int countHouseByAddress(PageBean pageBean);
}