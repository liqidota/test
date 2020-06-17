package com.liqi.bdqn.dao.impl;

import com.liqi.bdqn.dao.BaseDao;
import com.liqi.bdqn.dao.UserDao;
import com.liqi.bdqn.eneity.MyUser;

public class UserDaoImpl implements UserDao {
	BaseDao basedao =new BaseDao();
	@Override
	public int insertUser(MyUser user) {
		String sql="insert into myuser (myname,mypwd) values(?,?)";
		Object[] obj= {
				user.getMyname(),
				user.getMypwd()
		};
		
		return  basedao.executeUpdate(sql, obj);
		
	}

	

}
