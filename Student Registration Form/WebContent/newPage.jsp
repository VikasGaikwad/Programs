<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function validation()
{
for(var i=0;i<document.myform.count.value;i++)
{
	if(document.myform.check[i].checked){
		document.myform.id[i].disabled=false;
		document.myform.first_name[i].disabled=false;
		document.myform.last_name[i].disabled=false;
		document.myform.address[i].disabled=false;
		document.myform.age[i].disabled=false;
		document.myform.password[i].disabled=false;
		
	}
	if (!document.myform.check[i].checked) {
		document.myform.id[i].disabled=true;
		document.myform.first_name[i].disabled=true;
		document.myform.last_name[i].disabled=true;
		document.myform.address[i].disabled=true;
		document.myform.age[i].disabled=true;
		document.myform.password[i].disabled=true;
	}
	
}
}
</script>
</head>
<body bgcolor="#fff">

<form name="myform" action="updateAndDelete" method ="post">

	<table border="2" align="center" cellpadding="5" cellspacing="0"
		bgcolor="#000">
		<tr bgcolor="#fff">
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
			int count = 0;
			while (rs.next()) {
				count++;
		%>

		<tr>
			<td><input type="checkbox" name="check" value="<%=rs.getInt(1)%>" onclick="validation()">
			<td><input type="text" name="id" disabled="true" value="<%=rs.getInt(1)%>"></td>
			<td><input type="text" name="first_name" disabled="true" value="<%=rs.getString(2)%>"></td>
			<td><input type="text" name="last_name" disabled="true" value="<%=rs.getString(3)%>"></td>
			<td><input type="text" name="address" disabled="true" value="<%=rs.getString(4)%>"></td>			
			<td><input type="text" name="age" disabled="true" value="<%=rs.getInt(5)%>"></td>
			<td><input type="text" name="password" disabled="true" value="<%=rs.getString(6)%>"></td>
		</tr>


		<%
			}
		%>
	</table>
	<center >
		<input type="hidden" name="count" value="<%=count%>" />
		<br><br> <input	type="submit" name="action" value="update"/> 
		 <input type="submit" name="action" value="delete" />
	</center>
	</form>
</body>
</html>