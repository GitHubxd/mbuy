package com.mbuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mbuy.entitys.MbuyUser;
import com.mbuy.model.UserVo;

@Mapper
public interface MbuyUserMapper {
	int insert(MbuyUser record);
	int update(MbuyUser record);
	int select(MbuyUser record);
	int delate(MbuyUser record);
	
	List<UserVo> getUsers(UserVo userVo);
}