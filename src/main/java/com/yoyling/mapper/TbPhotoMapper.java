package com.yoyling.mapper;

import com.yoyling.domain.TbPhoto;

public interface TbPhotoMapper {
    int deleteByPrimaryKey(Integer xid);

    int insert(TbPhoto record);

    int insertSelective(TbPhoto record);

    TbPhoto selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(TbPhoto record);

    int updateByPrimaryKey(TbPhoto record);
}