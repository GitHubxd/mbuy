package com.mbuy.resource.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.model.UserVo;
import com.mbuy.service.user.UserService;

@RestController
@RequestMapping("/mbuy/user")
public class UserResouce implements IUserResouce {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@Override
	public void addUser(@RequestBody UserVo user) {
		userService.add(user);
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
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@Override
	public List<UserVo> getUsers(@RequestBody UserVo user) {
		List<UserVo> list = userService.getUsers(user);
		return list;

	}
	
}
