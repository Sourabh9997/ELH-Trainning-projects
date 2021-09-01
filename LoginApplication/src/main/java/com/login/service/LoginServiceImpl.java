package com.login.service;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.exception.MyException;
import com.login.model.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByuserIdAndPassword(User user) throws MyException {
		User userDummy=null;
		int userIdDigit=String.valueOf(user.getUserId()).length();
		int passwordCharacter=user.getPassword().length();
		if (userIdDigit >5) {
			if (passwordCharacter>5) {
			
			LoginDao loginDao=new LoginDaoImpl();
			userDummy=loginDao.readByuserIdAndPassword(user);
		}else {
			throw new MyException("Please enter 5 characters for password ");
		}
		}
		else {
			throw new MyException("Please enter 5 digits for user ID ");
		}
	return userDummy;
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
