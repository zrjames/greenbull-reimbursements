package com.greenbull.servlets;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RequestHelper
 */
public class RequestHelper  {
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		//switch case for discerning which servlet to call,
		//based on the current page
		switch(request.getRequestURI()) {
			default:
				return null;
		}
	}
}
