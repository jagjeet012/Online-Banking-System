<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="javax.servlet.http.HttpSession,org.jagjeet.bankingsystem.model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<script>
		var obj = {
			"title" : "Add Account",
			"url" : "login?action=addAccount"
		};
		window.history.pushState(obj, obj.title, obj.url);
	</script>
	<br>
	<%
		HttpSession s = request.getSession(false);

		if (s != null) {
			User user = (User) s.getAttribute("user");
			if (user == null) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
				dispatcher.forward(request, response);
			}
	%>
	Welcome
	<%=(user).getUserName()%>
	<br>
	<br>
	<%
		} else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
		}
	%>

	<%
		if (request.getAttribute("message") != null && !(request.getAttribute("message").toString().equals(""))) {
	%>

	<c:out value="${message }"></c:out>
	<%
		}
	%>
	<br>
	<br> Add an Account
	<br>
	<br>

	<form action="user" method="get">
		<input type="hidden" name="action" value="addAccount" size="20px">
		User ID <input type="text" name="userId" size="20px"> <br>
		User Name <input type="text" name="userName" size="20px"> <br>
		User password <input type="password" name="password" size="20px">
		<br> <input type="submit" value="add">
	</form>

	<form action="login">
		<input type="hidden" name="action" value="login" size="20px">
		<input type="submit" value="goToMenu">
	</form>

	<br>
	<br>
</body>
</html>