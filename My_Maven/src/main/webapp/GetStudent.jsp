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
			<table border="1" width="100%" align="center" cellpadding=8px
				cellspacing=".2">

				<tr style="background: skyblue">
					<th>id</th>
					<th>rollNo</th>
					<th>fname</th>
					<th>lname</th>
					<th>session</th>
				</tr>

				<%
				ArrayList list = (ArrayList) request.getAttribute("ok");
				Iterator<StudentBean> it = list.iterator();
				while (it.hasNext()) {
					StudentBean bean = it.next();
				%>
				<tr>
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