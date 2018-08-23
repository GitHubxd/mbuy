package com.mbuy.resource.user;

import java.util.List;

import com.mbuy.model.UserVo;

/**
 * 用户相关
 * 
 * @author xd
 *
 */
public interface IUserResouce {
	void addUser(UserVo user);
	
	/**
	 * 查询用户
	 * 
	 * @param user
	 * @param req
	 * @return
	 */
	List<UserVo> getUsers(UserVo user);
}
