package com.mbuy.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.mapper.MbuyUserMapper;
import com.mbuy.model.UserVo;
import com.mbuy.utils.CommonResponse;
import com.mbuy.utils.ErrorCode;
import com.mbuy.utils.MD5Utils;

/**
 * 登录服务
 * 
 * @author 37523
 *
 */
@Service
public class LoginService {

	@Autowired
	private MbuyUserMapper userMapper;

	/**
	 * 用户登录认证
	 * 
	 * @param userVo
	 * @return
	 */
	public CommonResponse loingService(UserVo userVo) {
		String pwd = MD5Utils.getMD5(userVo.getPassword());
		userVo.setPassword(pwd);
		Integer count = userMapper.selectByUser(userVo);
		CommonResponse commonResponse = null;
		if (count > 0) {
			commonResponse = CommonResponse.getInstance();
		} else {
			commonResponse = CommonResponse.getInstance();
			commonResponse.setErrorCode(ErrorCode.LOGIN_ERROR_10010);
		}
		return commonResponse;
	}
}
