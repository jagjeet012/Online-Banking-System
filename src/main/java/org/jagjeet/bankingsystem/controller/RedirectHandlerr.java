package org.jagjeet.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectHandlerr extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String jspName = "";
		if (action.equals("login")) {
			jspName = "/login.jsp";
		} else if (action.equals("logout")) {
			jspName = "/logout.jsp";
		} else if (action.equals("register")) {
			jspName = "/register.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jspName);
		dispatcher.forward(request, response);
	}

}
