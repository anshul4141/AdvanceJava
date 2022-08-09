<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<option value="1">one</option>
<body>
	<form action="">
		Text Field<input type="text" name="User"> Password Field<input
			type="password" name="pwd"> Checkbox<input type="checkbox"
			name="kid" value="1"> Radio Button <input type="radio"
			name="degree" value="MCA"> <input type="radio" name="degree"
			value="BE"> Button<input type="button" name="action"
			value="Go"> Submit Button<input type="submit" value="Submit">
		Reset Button<input type="reset" value="Clear"><br>

		TextArea
		<textarea name="tArea" rows="2" cols="20"></textarea>
		<br> List<select name="list">
			<option value="1">one</option>
			<option value="2">two</option>
		</select><br> Hidden Value<input type="hidden" name="id" value="123">
	</form>
</body>
</html>