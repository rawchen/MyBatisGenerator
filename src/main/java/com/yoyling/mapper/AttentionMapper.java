package com.yoyling.mapper;

import com.yoyling.domain.Attention;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}