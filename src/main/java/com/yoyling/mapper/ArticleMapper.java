package com.yoyling.mapper;

import com.yoyling.domain.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}