<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body bgcolor="10D7CAF">
	<%@ include file="Headar.jsp"%>
	<title>My profile</title>
	<h1 style="text-align: center;">Please Registar here...</h1>
	<form action="RegistrationCtrl" method="post">
		<%
		String fname = (String) request.getAttribute("fname");
		String lname = (String) request.getAttribute("lname");
		String userid = (String) request.getAttribute("userid");
		String pwd = (String) request.getAttribute("pwd");
		String gender = (String) request.getAttribute("gender");
		String number = (String) request.getAttribute("number");
		String dob = (String) request.getAttribute("dob");
		%>
		<center>
			<table border="20px">
				<tr>
					<th><b>First Name*:</b></th>
					<td><input type="text" name="fname" value=""
						placeholder="FirstName"></td>
					<td>
						<%
						if (fname != null) {
						%> <font color="Red"> <%=fname%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Last Name*:</b></th>
					<td><input type="text" name="lname" value=""
						placeholder="LastName"></td>
					<td>
						<%
						if (lname != null) {
						%> <font color="Red"> <%=lname%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Login Id*:</b></th>
					<td><input type="email" name="userid" value=""
						placeholder="EmailId"></td>
					<td>
						<%
						if (userid != null) {
						%> <font color="Red"> <%=userid%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Password*:</b></th>
					<td><input type="password" name="pwd" value=""
						placeholder="Password"></td>
					<td>
						<%
						if (pwd != null) {
						%> <font color="Red"> <%=pwd%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th>Gender*:</th>
					<td><label for="gender" style="text-align: center;"></label> <input
						type="radio" name="gender" value=" male" selected>Male <input
						type="radio" name="gender" value="female" selected>Female
						<input type="radio" name="gender" value="others" selected>Others</td>
					<td>
						<%
						if (gender != null) {
						%> <font color="Red"> <%=gender%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Mobile No*.:</b></th>
					<td><input type="number" name="number" value=""
						placeholder="mob"></td>
					<td>
						<%
						if (number != null) {
						%> <font color="Red"> <%=number%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Date of Birth*:</b></th>
					<td><input type="date" name="dob" placeholder="dd/mm/yyyy"></td>
					<td>
						<%
						if (dob != null) {
						%> <font color="Red"> <%=dob%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="submit" value="submit">
						<input type="reset" name="reset"
						value="reset"></td>
				</tr>
				</center>
				</form>
			</table>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</head>
</html>