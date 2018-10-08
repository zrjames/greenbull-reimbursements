package com.greenbull.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greenbull.controller.LoginController;
import com.greenbull.controller.LogoutController;
import com.greenbull.controller.MenuController;


/**
 * Servlet implementation class RequestHelper
 */
public class RequestHelper  {
	public static String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Showing the URI: " + request.getRequestURI());
		//switch case for discerning which servlet to call,
		//based on the current page
		switch(request.getRequestURI()) {
			
			case "/GreenBull-Reimbursement/html/Login.do":
				return LoginController.Login(request);
			
			case "/GreenBull-Reimbursement/html/Logout.do":
				return LogoutController.Logout(request, response);
			
			case "/GreenBull-Reimbursement/html/MenuJSON.do":
				return MenuController.MenuJSON(request, response);
				
			case "/GreenBull-Reimbursement/html/Employee.do":
				return MenuController.Employee(request);
		
			case "/GreenBull-Reimbursement/html/MenuReimbursements.do":
				return MenuController.MenuReimbursements(request, response);
			
			/*
			case "/PetsExample/html/Register.do":
				return RegisterController.Register(request);
			*/
			default:
				return "/html/login.html";
		}
	}
}
