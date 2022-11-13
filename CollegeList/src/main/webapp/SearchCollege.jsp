<%@page import="com.sunilos.bean.CollegeBean"%>
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
			<table border="1" width="100%" align="center" cellpadding=8px
				cellspacing=".2">
				<tr style="background: skyblue">
					<td>Id</td>
					<td>CollegeName</td>
					<td>CollegeMob</td>
					<td>CollegeAddress</td>
				</tr>
				<%
				ArrayList list = (ArrayList) request.getAttribute("list");
				Iterator<CollegeBean> it = list.iterator();
				while (it.hasNext()){
					CollegeBean bean = it.next();
				%>
				<tr>
				 <td><%=bean.getId()%></td>
				 <td><%=bean.getCollegeName()%></td>
				 <td><%=bean.getCollegeMob()%></td>
				 <td><%=bean.getCollegeAddress()%></td>
				</tr>
				<%
				}
				%>
			</table>
		</center>
	</form>
</body>
</html>