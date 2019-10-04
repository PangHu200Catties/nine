package com.rent.dao;

import com.rent.domain.Authcode;

public interface AuthcodeMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Authcode record);

    int insertSelective(Authcode record);

    Authcode selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Authcode record);

    int updateByPrimaryKey(Authcode record);
}