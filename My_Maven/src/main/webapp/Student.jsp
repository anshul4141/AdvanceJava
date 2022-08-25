<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="7D7CAF">
	<%@ include file="Headar.jsp"%>
	<center>
		<form action="StudentCtrl" method="post">
			<table border="10px">
				<tr>
					<th><b>Roll no.-</b></th>
					<td><input type="text" value="" name="rollNo"></td>
				</tr>
				<tr>
					<th><b>First Name -</b></th>
					<td><input type="text" value="" name="fname"></td>
				</tr>
				<tr>
					<th><b>Last Name -</b></th>
					<td><input type="text" value="" name="lname"></td>
				</tr>
				<tr>
					<th><b>session -</b></th>
					<td><input type="text" value="" name="session"></td>
				</tr>
				<th></th>
				<td>
				<input type="submit" value="add" name="operation">
				<input type="submit" value="modify" name="operation">
				<input type="submit" value="delete" name="operation">
				</td>
				<tr>
					<td colspan="2" align="center"><a href="GetTestStudent.jsp"><b>GetStudentId</b></a>
						| <a href="SearchTestStudent.jsp"><b>SearchList</b></a>&nbsp;</td>
				</tr>
			</table>
		</form>
	</center>
	<%@ include file="Footer.jsp"%>
</body>
</html>