package com.liqi.bdqn.service.impl;

import com.liqi.bdqn.dao.UserDao;
import com.liqi.bdqn.dao.impl.UserDaoImpl;
import com.liqi.bdqn.eneity.MyUser;
import com.liqi.bdqn.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userdao =new UserDaoImpl();
	@Override
	public int insertUser(MyUser user) {
		return userdao.insertUser(user);
		
	}

}
