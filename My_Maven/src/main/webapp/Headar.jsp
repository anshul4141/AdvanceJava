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
	String myname = (String) request.getAttribute("myname");
	if (myname != null) {
	%>
	<h3>
		Hello....
		<%=myname%>
	</h3>
	<%
	} else {
	%>
	<h3>Hello Guest..!!</h3>
	<%
	}
	%>
	<div style="text-align: center;">
		<img align="right" src="C:\Users\dell\Downloads\rays.png" />
	</div>
	<a href="LogOut.jsp">LogOut</a> |
	<a href="">Home</a> |
	<a href="">Training Programs</a> |
	<a href="">Enquiry</a> |
	<a href="">Tutorials</a> |
	<a href="">About Us</a> |
	<a href="">Contact Us</a> |
	<br>
	<br>
	<br>
	<br>
	<HR>
</body>
</html>