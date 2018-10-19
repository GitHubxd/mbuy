package com.mbuy.resource.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.model.UserVo;
import com.mbuy.service.user.UserService;
import com.mbuy.utils.CommonResponse;

@RestController
@RequestMapping("/mbuy/user")
public class UserResouce implements IUserResouce {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@Override
	public CommonResponse addUser(@RequestBody UserVo user) {
		return userService.add(user);
	}
	
	@Override
	public void updateUser(@RequestBody UserVo user) {
		userService.update(user);
	}
	@Override
	public void delateUser(@RequestBody UserVo user) {
		userService.delate(user);
	}
	@Override
	public void selectUser(@RequestBody UserVo user) {
		userService.select(user);
	}
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.POST)
	@Override
	public CommonResponse getUsers(@RequestBody UserVo user) {
		List<UserVo> list = userService.getUsers(user);
		CommonResponse commonResponse = CommonResponse.getInstance();
		commonResponse.setResult(list);
		return commonResponse;
	}
	
}
