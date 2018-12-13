package com.chuanyi.service.inter;

import com.chuanyi.bean.Admin;
import com.chuanyi.bean.User;

public interface IUserService {
	//用户登录
	public User userLogin(User user);
	//用户注册
	public int addUser(User user);
}
