<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body bgcolor="7D7CAF">
<title>My profile</title>
<div style="text-align: center;">
	<img src="C:\Users\dell\Downloads\rays.png" width="200px" />
</div>
<hr>
<h1 style="text-align: center;">My Profile</h1>
<form action="UserServlet" style="text-align: center;">
	<center>
		<table>
			<tr>
				<th><b>LoginID*:</b></th>
				<td><input type="email" name="email" value=""
					placeholder="email"></td>
			</tr>
			<tr>
				<th><b>First Name*:</b></th>
				<td><input type="text" name="fname" value=""
					placeholder="fname"></td>
			</tr>
			<tr>
				<th><b>Last Name*:</b></th>
				<td><input type="text" name="lname" value=""
					placeholder="lname"></td>
			</tr>
			<tr>
				<th>Gender:</th>
				<td><label for="gender" style="text-align: center;"></label> <input
					type="radio" name="gender" value=" male" selected>Male <input
					type="radio" name="gender" value="female" selected>Female <input
					type="radio" name="gender" value="others" selected>Others</td>
			</tr>
			<tr>
				<th><b>Mobile No.:</b></th>
				<td><input type="number" name="number" value=""
					placeholder="mob"></td>
			</tr>
			<tr>
				<th><b>Date of Birth(dd/mm/yyyy):</b></th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="submit" value="submit">
					<input type="submit" name="change password" value="change password">
				</td>
			</tr>
			</center>
			</form>
		</table>
		<hr>
		<h2 style="text-align: center;">(c)copyrights SunilOS Infotech
			Pvt.Ltd.</h2>
</body>
</head>
</html>