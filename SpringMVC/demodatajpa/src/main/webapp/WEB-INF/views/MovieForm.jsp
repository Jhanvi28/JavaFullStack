<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="addMovie">
Movie id : <input type="number" name="mid"><br><br>
Movie name : <input type="text" name="mname"><br><br>
Language <select name="lang">
<option></option>
<option value="English">English</option>
<option value="Hindi">Hindi</option>
<option value="other">other</option>
</select><br><br>
Director : <input type="text" name="mdirector"><br><br>
<input type="submit" value="Insert Movie">
</form>
</body>
</html>