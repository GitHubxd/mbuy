package com.mbuy.resouce.user;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void addUser(UserVo user) {
		userService.add(user);
	}

}
