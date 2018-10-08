package com.greenbull.controller;



import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.greenbull.dao.ReimbDAOImpl;

public class FormController {

	public static String Form (HttpServletRequest request) throws ServletException, IOException, SQLException {
		if (request.getMethod().equals("GET")) {
			//CHANGE LATER
			return "/html/form.html";
		}

		ReimbDAOImpl reimbDao = new ReimbDAOImpl();
		//Reimbursements reimb = new Reimbursements();
		reimbDao.FormInsert(request);

		

		//System.out.println("request? " + request);
		//response.setContentType("text/html");
		//request.getRequestDispatcher("form.html").include(request, response);
		//Everything is a string for now

		//Change to where ever we direct
		return "/html/Employee.html";
	}
}