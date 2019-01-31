<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.ArrayList,java.util.Iterator,javax.servlet.http.HttpSession,org.jagjeet.bankingsystem.model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Remove User</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<br>
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

	<script>
		function selUser(uId, uName) {
			$('#uId').val(uId);
			$('#u_id').val(uName);
		}

		var obj = {
			"title" : "Remove User",
			"url" : "remove?action=removeUser"
		};
		window.history.pushState(obj, obj.title, obj.url);
	</script>

	<%
		if (request.getAttribute("message") != null && !(request.getAttribute("message").toString().equals(""))) {
	%>
	<c:out value="${message }"></c:out>
	<%
		}
	%>

	<br> Select a User
	<br>
	<br>

	<c:choose>
		<c:when test="${availableUsers eq null}">
			<c:out
				value="We failed to fetch available Users, Sorry for Inconvenience caused"></c:out>
		</c:when>

		<c:when test="${not empty availableUsers}">

			<div class="container">
				<div class="dropdown">
					<input id="u_id" class="btn btn-primary dropdown-toggle"
						type="button" data-toggle="dropdown" value="Users"> <span
						class="caret"></span>
					
					<ul class="dropdown-menu">




					</ul>
				</div>
			</div>

		</c:when>

		<c:otherwise>
			<c:out value="No Users Available"></c:out>
		</c:otherwise>
	</c:choose>

	<br>
	<br>

	<form action="remove" method="get">
		<input type="hidden" name="action" value="removeAccount"> <input
			type="hidden" id="uId" name="uId" value=""> <input
			type="submit" value="remove">
	</form>

	<br>
	<br>
	<form action="login">
		<input type="hidden" name="action" value="login" size="20px">
		<input type="submit" value="index">
	</form>
</body>
</html>