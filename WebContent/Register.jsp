<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
  <% %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Transport App</title>
<script type="text/javascript" src="Script.js"></script>
</head>
<body>
<h1>Register</h1><form>
		
	</form>
<form action="Register" method="post">
<h6>Name</h6><input type="text" name="name" ><br>
<h6>EmpId</h6><input type="text" name="empid"><br>
<h6>ProjectId</h6><input type="text" name="projectid"><br>
<h6>Password</h6><input type="password" name="password"><br>
<h6>Location</h6><input type="text" name="location"><br>
<select name="currentoffice">
<option value="CTS">C.T.S</option>
</select>
<input type="submit" value="Register">
</form>
</body>
</html>

