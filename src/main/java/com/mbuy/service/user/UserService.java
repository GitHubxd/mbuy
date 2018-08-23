package com.mbuy.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.mapper.MbuyUserMapper;
import com.mbuy.model.UserVo;

@Service
public class UserService {

	@Autowired
	private MbuyUserMapper userMapper;

	public void add(UserVo user) {
		userMapper.insert(user);
	}
}