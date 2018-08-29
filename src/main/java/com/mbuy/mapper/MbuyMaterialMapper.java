package com.mbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyMaterial;

@Mapper
public interface MbuyMaterialMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MbuyMaterial record);

    MbuyMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(MbuyMaterial record);
}