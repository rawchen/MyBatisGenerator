package com.yoyling.mapper;

import com.yoyling.domain.Enjoy;

public interface EnjoyMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Enjoy record);

    int insertSelective(Enjoy record);

    Enjoy selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Enjoy record);

    int updateByPrimaryKey(Enjoy record);
}