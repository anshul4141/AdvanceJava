<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"></h1>
	<form action="LoginCtrl" method="post">
		<%
		String error = (String) request.getAttribute("error");
		String userid = (String) request.getAttribute("userid");
		String pwd = (String) request.getAttribute("pwd");
		String msg=(String)request.getAttribute("msg");
		if (error != null) {
		%>
		<center>
			<font color="Red"> <%=error%></font>
		</center>
		<%
		
		}
		%>
		<center>
			<font color="green"><h3>Registration Successfully Please login....</h3></font>
			<%if(msg!=null){
				
			%>
			<font color="red"><h3><%= msg %></h3></font>
			<%
			} %>

		</center>
		<table align="center">
			<tr>
				<th>Username*:</th>
				<td><input type="text" name="userid" value=""></td>
				<td>
					<%
					if (userid != null) {
					%> <font color="Red"> <%=userid%></font> <%
 }
 %>
				</td>
			</tr>
			<tr>
				<th>Password*:</th>
				<td><input type="password" name="pwd" value=""></td>
				<td>
					<%
					if (pwd != null) {
					%> <font color="Red"> <%=pwd%></font> <%
 }
 %>
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="log In"> <input
					type="reset" name="cancel" value="cancel"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="UserRegistration.jsp"><b>SignUp</b></a>
					| <a href="ForgetYourPassword.jsp"><b>Forget my password</b></a>&nbsp;</td>
			</tr>
		</table>
	</form>
</body>
</html>