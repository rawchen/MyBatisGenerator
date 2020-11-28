package com.yoyling.mapper;

import com.yoyling.domain.PhotoPro;

public interface PhotoProMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(PhotoPro record);

    int insertSelective(PhotoPro record);

    PhotoPro selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(PhotoPro record);

    int updateByPrimaryKey(PhotoPro record);
}