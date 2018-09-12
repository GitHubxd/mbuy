package com.mbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyGoods;

@Mapper
public interface MbuyGoodsMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(MbuyGoods record);

    MbuyGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MbuyGoods record);

}