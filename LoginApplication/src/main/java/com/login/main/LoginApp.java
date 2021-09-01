package com.login.main;

import java.util.Scanner;

import com.login.exception.MyException;
import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter User Id");
		int id = input.nextInt();
		System.out.println("Enter Password");
		String pwd = input.next();
		LoginService loginService = new LoginServiceImpl();
		User user = new User();
		user.setUserId(id);
		user.setPassword(pwd);
User ans=null;
try {
	ans = loginService.readByuserIdAndPassword(user);
} catch (MyException e) {
	System.err.println(e.getMessage());
}
if(ans != null) {
	System.out.println("Welcome "  +ans.getUserName());
}

	}

}
