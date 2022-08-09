<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"></h1>
	<form method="get" action="LoginCtrl">
		<table align="center">
			<tr>
				<th>Username*:</th>
				<td><input type="text" name="user" value=""></td>
			</tr>
			<tr>
				<th>Password*:</th>
				<td><input type="password" name="pwd" value=""></td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="log In"> <input
					type="reset" name="cancel" value="cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>