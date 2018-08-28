package com.myweb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myweb.dao.UserMapper;
import com.myweb.pojo.User;
import com.myweb.service.UserService;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource(name="userMapper")
    private UserMapper userMapper;
	
	@Override
	public List<User> getUsers() throws Exception {
		return userMapper.selectByExample(null);
	}
}
