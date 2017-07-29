<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<title>JSP Page</title>
</head>
<body bgcolor="#DDDDDD">
	<h1>Spring nestedpath and bind tag example</h1>

	<h3>Your Details are...</h3>
	<h4>${name.userName}</h4>
	<h4>${name.country}</h4>
	<h4>${name.email}</h4>
</body>
</html>