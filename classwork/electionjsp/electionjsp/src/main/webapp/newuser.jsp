<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>${initParam.appTitle}</h3>
		<form method=" action="register.jsp">
		First Name:<input type="text" name="firstname"/> <br/><br/>
		Last Name: <input type="text" name="lastName"/> <br/><br/>
		Email: <input type="text" name="email"/> <br/><br/>
		Password: <input type="password" name="passwd"/> <br/><br/>
		Birth: <input type="date" name="birth"/> <br/><br/>
		<input type="submit" Value="Register"/>
		</form>
</body>
</html>