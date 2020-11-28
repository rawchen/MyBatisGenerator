package com.yoyling.mapper;

import com.yoyling.domain.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}