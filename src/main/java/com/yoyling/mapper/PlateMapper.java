package com.yoyling.mapper;

import com.yoyling.domain.Plate;

public interface PlateMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Plate record);

    int insertSelective(Plate record);

    Plate selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Plate record);

    int updateByPrimaryKey(Plate record);
}