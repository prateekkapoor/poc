<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<title>JSP Page</title>
</head>
<body bgcolor="#DDDDDD">
	<h1>Spring nestedpath and bind tag example</h1>
	<spring:nestedPath path="name">
         Enter Your Details...
    <form action="" method="post">
			Name:
			<spring:bind path="userName">
				<input type="text" name="${status.expression}"
					value="${status.value}">
				<br />
			</spring:bind>
			Country:
			<spring:bind path="country">
				<input type="text" name="${status.expression}"
					value="${status.value}">
				<br />
			</spring:bind>
			Email:
			<spring:bind path="email">
				<input type="text" name="${status.expression}"
					value="${status.value}">
			</spring:bind>
			<input type="submit" value="OK">
		</form>
	</spring:nestedPath>

</body>
</html>
>
