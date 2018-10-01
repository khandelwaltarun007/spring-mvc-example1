<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
	<form:form action="add" method="POST">
		<table>
			<tr>
				<td>
					<label>Name: </label>
				</td>
				<td>
					<input type="text" name="name" />
				</td>
			</tr>
			<tr>
				<td>
					<label>Standard</label>
				</td>
				<td>
					<input type="text" name="std" />
				</td>
			</tr>
		</table>
		<input type="submit" value="<spring:message text="Add Student"/>" >
	</form:form>

</body>
</html>