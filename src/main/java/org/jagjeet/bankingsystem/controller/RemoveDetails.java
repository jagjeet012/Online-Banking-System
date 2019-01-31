package org.jagjeet.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jagjeet.bankingsystem.model.User;

public class RemoveDetails extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		String jspName = "/login.jsp";
		if (session != null) {
			User user = (User) session.getAttribute("user");
			String action = request.getParameter("action");

			if (action.equals("remove")) {
				jspName = "/remove.jsp";
			}
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

}
