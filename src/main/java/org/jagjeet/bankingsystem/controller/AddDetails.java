package org.jagjeet.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jagjeet.bankingsystem.model.User;

public class AddDetails extends HttpServlet {

	User user = new User();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		String jspName = "/index.jsp";
		if (session != null) {
			User user = (User) session.getAttribute("user");
			String action = request.getParameter("action");

			if (action.equals("register")) {
				jspName = "/register.jsp";
			}
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
		dispatcher.forward(request, response);
	}

}
