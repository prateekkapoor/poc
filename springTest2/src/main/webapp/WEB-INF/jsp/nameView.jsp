<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>JSP Page</title>
</head>
<body bgcolor="#DDDDDD">
	<h1>Spring nestedpath and bind tag example</h1>
	<form:form method="POST" commandName="name">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Country :</td>
				<td><form:input path="country" /></td>
			</tr>
			<tr>
				<td>Email Id :</td>
				<td><form:input path="email" /></td>


			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>

