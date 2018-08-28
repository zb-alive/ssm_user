package com.myweb.service;

import java.util.List;

import com.myweb.pojo.User;

public interface UserService {
	
	public List<User> getUsers() throws Exception;
}
