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
	<%@ include file="Headar.jsp"%>
	<h1 align="center"></h1>
	<form action="LoginCtrl" method="post">
		<%
		String sMsg = (String) request.getAttribute("sMsg");
		String userid = (String) request.getAttribute("userid");
		String pwd = (String) request.getAttribute("pwd");
		String msg = (String) request.getAttribute("msg");
		String error = (String) request.getAttribute("error");
		if (error != null) {
		%>
		<center>
			<font color="red"> <%=error%></font>
		</center>
		<%
		}
		%>
		<center>
			<%
			if (sMsg != null) {
			%>
			<center>
				<font color="green"> <%=sMsg%></font>
			</center>
			<%
			}
			%>
			<center>
				<%
				if (msg != null) {
				%>
				<font color="red"><h3><%=msg%></h3></font>
				<%
				}
				%>

			</center>
			<table border="10px" align="center">
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
					
					<td><input type="hidden" name="jsessionid"
						value="<%=session.getId()%>"></input></td>
					</td>
				</tr>
				<tr>
					<td><input type="submit" name="login" value="Sign In">
						<input type="reset" name="cancel" value="cancel"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><a href="RegistrationCtrl"><b>SignUp</b></a>
						| <a href=ForgetCtrl><b>Forget my password</b></a>&nbsp;</td>
				</tr>
			</table>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</html>

