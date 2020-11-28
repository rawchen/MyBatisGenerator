package com.yoyling.mapper;

import com.yoyling.domain.Visit;

public interface VisitMapper {
    int deleteByPrimaryKey(Integer visitid);

    int insert(Visit record);

    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Integer visitid);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}