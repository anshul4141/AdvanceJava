<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationForm</title>
</head>
<body bgcolor="ligtskyblue">
	<form action="TestMethod.jsp">
		<table align="center">
			<tr>
				<th><b>Login Id*</b></th>
				<td><input type="email" name="emailId" value=""></td>
			</tr>
			<tr>
				<th><b>First Name*</b></th>
				<td><input type="text" name="Fname" value=""></td>
			</tr>
			<tr>
				<th><b>Last Name*</b></th>
				<td><input type="text" name="Lname" value=""></td>
			</tr>
			<tr>
				<th><b>Gender:</b></th>
				<td><label for="Gender" style="text-align: center;"><label>
							<input type="radio" name="gender" value="male" selected>male
							<input type="radio" name="gender" value="female" selected>female
							<input type="radio" name="gender" value="other" selected>other</td>
			</tr>
			<tr>
				<th><b>DOB*</b></th>
				<td><input type="date" name="date" value=""></td>
			</tr>
			<tr>
				<th><b>Mobile*</b></th>
				<td><input type="number" name="mobNo" value=""></td>
			</tr>
			<tr>
				<th><b>Address*</b></th>
				<td><input type="text" name="address" value=""></td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="log In"> <input
					type="reset" name="cancel" value="cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>