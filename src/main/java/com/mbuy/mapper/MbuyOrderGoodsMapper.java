package com.mbuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyOrderGoods;

@Mapper
public interface MbuyOrderGoodsMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(MbuyOrderGoods record);

	List<MbuyOrderGoods> selectAll();

    int updateByPrimaryKeySelective(MbuyOrderGoods record);
}