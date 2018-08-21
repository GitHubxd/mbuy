package com.mbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyUser;

@Mapper
public interface MbuyUserMapper {
	int insert(MbuyUser record);
}