package com.greenbull.servlets;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenbull.controller.LoginController;


/**
 * Servlet implementation class RequestHelper
 */
public class RequestHelper  {
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		//switch case for discerning which servlet to call,
		//based on the current page
		switch(request.getRequestURI()) {
			
			case "/GreenBull-Reimbursement/html/Login.do":
				return LoginController.Login(request);
			/*
			case "/PetsExample/html/PetJSON.do":
				return HomeController.PetJSON(request, response);
			case "/PetsExample/html/Register.do":
				return RegisterController.Register(request);
			*/
			default:
				return "/html/login.html";
		}
	}
}
