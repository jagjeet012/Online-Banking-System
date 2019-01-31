package org.jagjeet.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jagjeet.bankingsystem.dao.AccountDaoImpl;
import org.jagjeet.bankingsystem.model.Account;
import org.jagjeet.bankingsystem.model.User;

public class GetDetails extends HttpServlet {

	AccountDaoImpl dao = new AccountDaoImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		String jspName = "/Login.jsp";
		String action = request.getParameter("action");
		if (session != null) {
			User user = (User) session.getAttribute("user");
			if (user != null) {
				if (action.equals("balance")) {
					dao.checkBalance((Account) request);
					jspName = "/balance.jsp";
				} else if (action.equals("deposit")) {
					dao.depositMoney((Account) request);
					jspName = "/deposit.jsp";
				} else if (action.equals("tranfer")) {
					dao.tranferMoney((Account) request);
					jspName = "/tranfer.jsp";
				} else if (action.equals("withdraw")) {
					dao.withdrawMoney((Account) request);
					jspName = "/withdraw.jsp";
				}
			}
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jspName);
		dispatcher.forward(request, response);

	}
}
