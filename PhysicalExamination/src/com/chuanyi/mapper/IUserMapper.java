package com.chuanyi.mapper;

import org.springframework.stereotype.Repository;

import com.chuanyi.bean.Admin;
import com.chuanyi.bean.User;
@Repository
public interface IUserMapper {
	
    public int addUser(User user);
    
    public User queryUserByPwd(User user); 
    
}
