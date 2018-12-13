package com.chuanyi.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuanyi.bean.Admin;
import com.chuanyi.mapper.IAdminMapper;
import com.chuanyi.service.inter.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	IAdminMapper adminMapper;
	@Override
	//后台用户登录
	public Admin adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.adminLogin(admin);
	}

}
