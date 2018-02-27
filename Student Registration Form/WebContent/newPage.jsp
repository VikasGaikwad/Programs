<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#dce1e5">


	<table border="2" align="center" cellpadding="5" cellspacing="0"
		bgcolor="#e7d3ed">
		<tr bgcolor="#4286f4">
			<td>select</td>
			<td>student id</td>
			<td>first name</td>
			<td>last name</td>
			<td>address</td>
			<td>age</td>
			<td>password</td>
		</tr>
		<%
			ResultSet rs = (ResultSet) request.getAttribute("store");

			while (rs.next()) {
		%>

		<tr>
			<td><input type="checkbox" name="check" ></td>
			
			<td><%=rs.getString("id")%></td>
			<td><%=rs.getString("first_name")%></td>
			<td><%=rs.getString("last_name")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("age")%></td>
			<td><%=rs.getString("password")%></td>
		</tr>


		<%
			}
		%>
	
</body>
</html>