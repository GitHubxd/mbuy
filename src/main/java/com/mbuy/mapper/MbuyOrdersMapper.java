package com.mbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyOrders;

@Mapper
public interface MbuyOrdersMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MbuyOrders record);

    int insertSelective(MbuyOrders record);

    MbuyOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MbuyOrders record);

    int updateByPrimaryKey(MbuyOrders record);
}