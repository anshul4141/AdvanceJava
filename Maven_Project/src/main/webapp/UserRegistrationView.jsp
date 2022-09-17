<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Please Register here....</h3>
	<form action="">
		<center>
			<table border="10px">
				<tr>
					<th>First Name:</th>
					<td><input type="text" name="fname" value=""
						placeholder="FirstName"></td>
				</tr>
				<tr>
					<th>Last Name:</th>
					<td><input type="text" name="lname" value=""
						placeholder="LastName"></td>
				</tr>
				</tr>
				<tr>
					<th>Email Id:</th>
					<td><input type="text" name="userid" value=""
						placeholder="Email"></td>
				</tr>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="pwd" value=""
						placeholder="Password"></td>
				</tr>
				</tr>
				<tr>
					<th>Gender:</th>
					<td><label for="gender" style="text-align: center;"></label> <input
						type="radio" name="gender" value=" male" selected>Male <input
						type="radio" name="gender" value="female" selected>Female
						<input type="radio" name="gender" value="others" selected>Others</td>
				</tr>
				<tr>
					<th>Mobile No:</th>
					<td><input type="number" name="number" value=""
						placeholder="MobileNo"></td>
				</tr>
				</tr>
				<tr>
					<th>Dob:</th>
					<td><input type="date" name="dob" value=""
						placeholder="dd/mm/yy"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="submit" value="submit">
						<input type="reset" name="reset" value="reset"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>