package com.mbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyOrderGoods;

@Mapper
public interface MbuyOrderGoodsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MbuyOrderGoods record);

    int insertSelective(MbuyOrderGoods record);

    MbuyOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MbuyOrderGoods record);

    int updateByPrimaryKey(MbuyOrderGoods record);
}