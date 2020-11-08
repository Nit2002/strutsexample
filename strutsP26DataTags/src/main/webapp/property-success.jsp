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
	<h1>Property, Push And Set Tag</h1>

	<h3>Property</h3>
	<s:property value="environment.name" />
	<s:property value="environment.version" />
	
	
	<!--  Imagine if you have 20 properties in the Environment class. Every time
	 you need to refer to these variables you need to add "environment." 
	 as the prefix. -->
	 <h3>Push</h3>
	<s:push value="environment">
		<s:property value="name" />
		<s:property value="version" />
	</s:push>
	
	<!-- create a new variable -->
	<h3>Set</h3>
	<s:set var="myEnvironmentName" value="environment.name" />
	<s:property value="myEnvironmentName" />


</body>
</html>