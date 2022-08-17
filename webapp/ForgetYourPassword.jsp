<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ForgetCtrl" method="post">
		<%
		String pass = (String) request.getAttribute("pass");
		if (pass != null) {
		%>
		<h1>
			<font color="pink"><h2><%=pass%></h2></font>
		</h1>
		<%
		}
		%>
		<center>
			<font color="red"><h1>Forget Your Password is here</h1></font>
			<h4>Submit your email address and we'll send you password.</h4>
			<p>Password is sent to your registration email id</p>

			<table>
				<tr>
					<td>
						<p>Email Id:</p>
					</td>
					<td><input type="email" name="userid"
						placeholder="Enter ID here"></td>
					<td>
						<button>
							<a style="float: center; text-decoration: none;">Go 
						</button>
					</td>
				</tr>

				<td></td>
				<td><font color="red">Email is required</font></td>

			</table>
		</center>
	</form>
</body>
</html>