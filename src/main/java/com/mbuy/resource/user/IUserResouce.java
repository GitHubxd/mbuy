package com.mbuy.resource.user;

import com.mbuy.model.UserVo;
import com.mbuy.utils.CommonResponse;

/**
 * 用户相关
 * 
 * @author xd
 *
 */
public interface IUserResouce {
	void addUser(UserVo user);
	void updateUser(UserVo user);
	void delateUser(UserVo user);
	void selectUser(UserVo user);
	
	/**
	 * 查询用户
	 * 
	 * @param user
	 * @param req
	 * @return
	 */
	CommonResponse getUsers(UserVo user);
}
