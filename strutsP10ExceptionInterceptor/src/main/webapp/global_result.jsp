<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exception</title>
</head>
<body >
	<h1><input type="button" value="Back" onclick="history.back()"> Exception Name :<s:property value="exception"/>  </h1>
	<p style="white-space: pre"> Exception Details :<s:property value="exceptionStack"/> </p>
	
</body>
</html>