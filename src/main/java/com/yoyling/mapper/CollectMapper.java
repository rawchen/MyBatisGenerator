package com.yoyling.mapper;

import com.yoyling.domain.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}