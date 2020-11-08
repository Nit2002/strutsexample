<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="text-align: center;">
	<br/><br/><br/>
	<h1>Welcome ExecAndWait Interceptor.</h1>	
  	<p> User input Time <s:property value="pTime"/> seconds </p>
  	<p>Task executed for <s:property value="processingTime"/> </p>
  	<a href="processing_time.jsp">Enter Time</a>
</body>
</html>