package com.rent.dao;

import com.rent.domain.House;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface HouseMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}