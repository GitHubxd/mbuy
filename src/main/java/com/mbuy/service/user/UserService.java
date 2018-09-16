package com.mbuy.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.mapper.MbuyUserMapper;
import com.mbuy.model.UserVo;

@Service
public class UserService {

	@Autowired
	private MbuyUserMapper userMapper;

	/**
	 * 增加用户
	 * 
	 * @param user
	 */
	public void add(UserVo user) {
		userMapper.insert(user);
	}
	public void update(UserVo user) {
		userMapper.update(user);
	}
	public void select(UserVo user) {
		userMapper.select(user);
	}
	public void delate(UserVo user) {
		userMapper.delate(user);
	}
	public List<UserVo> getUsers(UserVo userVo) {
		List<UserVo> list = userMapper.getUsers(userVo);
		return list;
	}
	
}
