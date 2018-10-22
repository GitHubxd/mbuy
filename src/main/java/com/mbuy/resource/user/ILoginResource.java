package com.mbuy.resource.user;

import com.mbuy.model.UserVo;
import com.mbuy.utils.CommonResponse;

/**
 * 登录相关
 * 
 * @author 37523
 *
 */
public interface ILoginResource {

	/**
	 * 登录
	 * 
	 * @param userVo
	 * @return
	 */
	CommonResponse login(UserVo userVo);
}
