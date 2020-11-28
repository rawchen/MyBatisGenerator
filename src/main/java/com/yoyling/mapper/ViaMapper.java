package com.yoyling.mapper;

import com.yoyling.domain.Via;

public interface ViaMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Via record);

    int insertSelective(Via record);

    Via selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Via record);

    int updateByPrimaryKey(Via record);
}