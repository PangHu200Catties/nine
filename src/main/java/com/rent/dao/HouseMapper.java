package com.rent.dao;

import com.rent.domain.House;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}