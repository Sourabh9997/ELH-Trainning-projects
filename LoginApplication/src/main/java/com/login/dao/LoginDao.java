package com.login.dao;

import com.login.exception.MyException;
import com.login.model.User;

public interface LoginDao {
public abstract User create(User user);
public abstract User readByuserIdAndPassword(User user) throws MyException ;	

public abstract User update(User user);
public abstract User delete(int userId); 



}
