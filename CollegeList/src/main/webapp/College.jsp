<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CollegeCtrl" method="post">
		<center>
		<br>
		<br>
		<br>
			<table border=8px">
				<tr>
					<th>CollegeName*</th>
					<td><input type="text" value="" name="collegeName" placeholder="Enter Your College Name"></td>
				</tr>
				<tr>
					<th>CollegeMob*</th>
					<td><input type="text" value="" name="collegeMob" placeholder="Enter Your MobNo."></td>
				</tr>
				<tr>
					<th>CollegeAddress*</th>
					<td><input type="text" value="" name="collegeAddress" placeholder="Enter Your Address"></td>
				</tr>
				<th></th>
				<td>
				    <input type="submit" value="add" name="operation">
					<input type="submit" value="modify" name="operation"> 
					<input type="submit" value="delete" name="operation">
					<a href="SearchListCollegeCtrl">SearchList</a>
				</td>
			</table>
		</center>
	</form>
</body>
</html>