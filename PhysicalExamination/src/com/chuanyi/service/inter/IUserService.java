package com.chuanyi.service.inter;

import com.chuanyi.bean.Admin;
import com.chuanyi.bean.User;

public interface IUserService {
	//�û���¼
	public User userLogin(User user);
	//�û�ע��
	public int addUser(User user);
}
