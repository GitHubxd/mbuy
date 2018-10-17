package com.mbuy.resource.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.model.UserVo;
import com.mbuy.service.user.LoginService;
import com.mbuy.utils.CommonResponse;

@RestController
@RequestMapping("/mbuy/user")
public class LoginResouce implements ILoginResouce {

	@Autowired
	LoginService loginService;

	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public CommonResponse login(@RequestBody UserVo userVo) {
		System.out.println("--------------------");
		return loginService.loingService(userVo);
	}

}
