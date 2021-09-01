package com.login.service;

import com.login.exception.MyException;
import com.login.model.User;

public interface LoginService { 
	public abstract User create(User user);
	public abstract User readByuserIdAndPassword(User user) throws MyException ;	

	public abstract User update(User user);
	public abstract User delete(int userId); 


}
