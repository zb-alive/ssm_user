package com.myweb.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.pojo.User;
import com.myweb.service.UserService;

@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;

	@RequestMapping("/userlist")
	public String list(ModelMap modelMap) throws Exception {
	  List<User> users = userService.getUsers();
	  modelMap.put("userList", users);
      return "list";		
	}
}
