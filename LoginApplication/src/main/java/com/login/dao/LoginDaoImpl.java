package com.login.dao;

import com.login.exception.MyException;
import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByuserIdAndPassword(User user) throws MyException {
		
		if (user.getUserId() == 123457 && user.getPassword().equals("sourabh12")) {
			user.setUserName("Hello");

		}
		if (user.getUserId() == 123456 && user.getPassword().equals("Rahul12")) {
			user.setUserName("world");
		}
		else {
			throw new MyException("No Such User");
		}
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
