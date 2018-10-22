package com.mbuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyOrders;

@Mapper
public interface MbuyOrdersMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(MbuyOrders record);

	List<MbuyOrders> selectAll();

    int updateByPrimaryKeySelective(MbuyOrders record);
}