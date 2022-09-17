<%@page import="com.rays.bean.MarksheetBean"%>
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
	<form action="">
		<center>
			<table border="10px">
				<tr>
					<td>id</td>
					<td>rollNo</td>
					<td>fname</td>
					<td>lname</td>
					<td>phy</td>
					<td>chm</td>
					<td>math</td>
				</tr>
				<%
				ArrayList list = (ArrayList) request.getAttribute("search");
				Iterator<MarksheetBean> it = list.iterator();
				while (it.hasNext()) {
					MarksheetBean bean = it.next();
				%>
				<tr>
					<td><%=bean.getId()%></td>
					<td><%=bean.getRollNo()%></td>
					<td><%=bean.getFname()%></td>
					<td><%=bean.getLname()%></td>
					<td><%=bean.getPhy()%></td>
					<td><%=bean.getChm()%></td>
					<td><%=bean.getMath()%></td>
				</tr>
				<%
				}
				%>
			</table>
		</center>
	</form>
</body>
</html>