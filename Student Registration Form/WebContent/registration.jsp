<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function ValidateForm() {
		var FirstName = document.myform.first_name.value;
		var LastName = document.myform.last_name.value;
		var address = document.myform.address.value;
		var age = document.myform.age.value;
		var password = document.myform.password.value;
		if (FirstName == null || FirstName == "") {
			alert("first name cant be blank");
			return false;
		} else if (LastName == null || LastName == "") {
			alert("last name cant be blank");
			return false;
		} else if (address == null || address == "") {
			alert("address cant be blank")
		} else if (age == null || age == "" || age > 150) {
			alert("age proper age")
		} else if (password == null || password.length<6) {
			alert("password cant be blank or more than 6")
		}
	}
</script>

<title>Insert title here</title>
</head>
<body>
	<form action="reg" align="center" method="post" name="myform"
		onsubmit="return ValidateForm()">
		<h1>Student registration page</h1>
		<input type="number" name="id" placeholder="id"><br>
		<br> <input type="text" name="first_name" placeholder="FirstName"><br>
		<br> <input type="text" name="last_name" placeholder="LastName"><br>
		<br>
		<textarea rows="5" cols="19" name="address" placeholder="address"></textarea>
		<br>
		<br> <input type="number" name="age" placeholder="age"><br>
		<br> <input type="password" name="password" placeholder="password"><br>
		<br> <input type="submit" value="register"><br>
		<br>

	</form>
	<form action="disp" method="post" align="center">
		<input type="submit" value="display">


	</form>
</body>
</html>