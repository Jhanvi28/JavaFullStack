<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="checkUser" method="post">
		Name : 
		<input type="text" name="uname">
		<br><br>
		Email : 
		<input type="text" name="uemail">
		<br><br>
		<input type="submit" value="send">
	</form>
</body>
</html>