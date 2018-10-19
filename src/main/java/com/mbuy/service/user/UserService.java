package com.mbuy.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.mapper.MbuyUserMapper;
import com.mbuy.model.UserVo;
import com.mbuy.utils.CommonResponse;
import com.mbuy.utils.ErrorCode;
import com.mbuy.utils.MD5Utils;

@Service
public class UserService {

	@Autowired
	private MbuyUserMapper userMapper;

	/**
	 * 增加用户 默认密码为 123456
	 * 
	 * @param user
	 */
	public CommonResponse add(UserVo user) {
		String pwd = MD5Utils.getMD5("123456");
		user.setPassword(pwd);
		int n = userMapper.insert(user);
		CommonResponse commonResponse = CommonResponse.getInstance();
		if (n == 0) {
			commonResponse.setErrorCode(ErrorCode.ADD_ERROR_10020);
		}
		return commonResponse;
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
