package com.greenbull.controller;

import javax.servlet.http.HttpServletRequest;

import com.greenbull.dao.UserDAOImpl;
import com.greenbull.users.User;

/*
 * What does this need to do?
 * This class acts as a controller called by a servlet
 * It takes the current request and gets information pertaining to a login in request
 * if it matches, go to the menu page with their username, password, and id
 * if not, go to the login page
 */
public class LoginController {

	public static String Login(HttpServletRequest request) {
		if (request.getMethod().equals("GET")) {
			//CHANGE LATER
			return "/html/login.html";
		}
		
		//get out input data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//test time
		System.out.println(username);
		
		//prepare object for accessing the database
		UserDAOImpl userDaoImpl = new UserDAOImpl();
		//prep for a new user object
		User user = new User();
		
		//return user by accessing it's info from the database
		user = userDaoImpl.readUserByUsername(username);
		
		//test time
		System.out.println(user);
		
		//if our name and password equals the one in the DB,
		//	make a session and go to Menu
		if( username.equals(user.getUsername()) && password.equals(user.getPassword()) ) {
			//store an object in the session
			request.getSession().setAttribute("User", user);

			return "/html/Employee.html";
		}
		//otherwise, reload login
		else {
			//CHANGE LATER
			return "/html/login.html";
		}
	}

}
