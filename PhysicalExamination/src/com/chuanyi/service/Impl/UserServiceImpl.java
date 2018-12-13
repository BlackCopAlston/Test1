package com.chuanyi.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuanyi.bean.Admin;
import com.chuanyi.bean.User;
import com.chuanyi.mapper.IUserMapper;
import com.chuanyi.service.inter.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserMapper userMapper;
	@Override
	//ÓÃ»§µÇÂ¼
	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUserByPwd(user);
	}
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	
}
