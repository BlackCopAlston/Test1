package com.chuanyi.service.inter;

import org.springframework.stereotype.Repository;

import com.chuanyi.bean.Admin;
@Repository
public interface IAdminService {
	//����Ա��½
	public Admin adminLogin(Admin admin);
}
