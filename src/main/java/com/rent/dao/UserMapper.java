package com.rent.dao;

import com.rent.domain.User;
import com.rent.utils.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    PageBean<User> findBySearch(@Param("search") String search,@Param("currentpage") int currentpage, @Param("pagesize") int pagesize);
}