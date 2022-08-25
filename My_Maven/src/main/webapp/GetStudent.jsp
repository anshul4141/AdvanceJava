<%@page import="com.rays.bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>

		<br> <br> <br>
		<center>
			<table border="6px"
				style="box-shadow: 3px 3px 5px black; color: cyan">
				<tr style="color: black">
					<td>id</td>
					<td>rollNo</td>
					<td>fname</td>
					<td>lname</td>
					<td>session</td>
				</tr>

				<%
				ArrayList list = (ArrayList) request.getAttribute("ok");
				Iterator<StudentBean> it = list.iterator();
				while (it.hasNext()) {
					StudentBean bean = it.next();
				%>
				<tr style="color: red">
					<td><%=bean.getId()%></td>
					<td><%=bean.getRollNo()%></td>
					<td><%=bean.getFname()%></td>
					<td><%=bean.getLname()%></td>
					<td><%=bean.getSession()%></td>
				</tr>
			</table>
			<%
			}
			%>
		</center>
	</form>
</body>
</html>