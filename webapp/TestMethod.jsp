<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String number = request.getParameter("number");
		String dob = request.getParameter("dob");
	%>
	<h1>
		Email ID :-
		<%=email%></h1>
	<h1>
		First Name :-
		<%=fname%></h1>
	<h1>
		Last Name :-
		<%=lname%></h1>
	<h1>
		Gender :-
		<%=gender%></h1>
	<h1>
		Mobile :-
		<%=number%>"
	</h1>
	<h1>
		DOB :-
		<%=dob%></h1>
	<h1></h1>
</body>
</html>