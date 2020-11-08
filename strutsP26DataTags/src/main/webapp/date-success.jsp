<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h1>Date Tag</h1>

	<h3>Date Format 1</h3>
    <s:date name = "currentDate" format = "dd/MM/yyyy" />

    <h3>Date Format 2</h3>
    <s:date name = "currentDate" format = "yyyy-MM-dd" />

</body>
</html>