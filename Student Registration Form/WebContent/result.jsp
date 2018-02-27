

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>student information table</h1>
	<%
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
	%>
	<table align="center" cellpadding="5" cellspacing="5" border="1"></table>

	<table>
		<tr bgcolor="#4286f4">
			<td>student id</td>
			<td>first name</td>
			<td>last name</td>
			<td>address</td>
			<td>age</td>
			<td>password</td>
		</tr>
		<%
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/common_data", "root", "root");
				st = conn.createStatement();
				
				rs = st.executeQuery("select * from stud_info");
				while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("id")%></td>
			<td><%=rs.getString("first_name")%></td>
			<td><%=rs.getString("last_name")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("age")%></td>
			<td><%=rs.getString("password")%></td>
		</tr>
		<%
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>


	</table>
</body>
</html>