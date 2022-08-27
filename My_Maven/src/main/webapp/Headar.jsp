<%@page import="com.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img align="right" src="C:\Users\dell\Downloads\rays.png" />
	<%
	UserBean user = (UserBean) session.getAttribute("user");
	if (user != null) {
	%>
	<h4>
		Hello....
		<%=user.getFname()%>
		<%=user.getLname()%><br> 
		<a href="LogOut.jsp">LogOut</a> | 
		<a href="">Home</a> | 
		<a href="">Training Programs</a> | 
		<a href="">Enquiry</a>| 
		<a href="">Tutorials</a> | 
		<a href="">About Us</a> | 
		<a href="">Contact Us</a> |
	</h4>
	<%
	} else {
	%>
	<h3>Hello Guest..!!</h3>
	<a href="LoginCtrl">Login</a>
	<%
	}
	%>
	<br>
	<HR>
</body>
</html>