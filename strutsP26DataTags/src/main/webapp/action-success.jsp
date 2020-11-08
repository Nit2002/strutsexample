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
	<h1>Action Tag</h1>

	<s:action name="actions" executeResult="true">
		<h3> Output :</h3>
	</s:action>
	
	<s:action name="actions" executeResult="false">
		<h3>Output :</h3>
	</s:action>
	
	<s:iterator value="#attr.names">
		<s:property /><br/>
	</s:iterator>

</body>
</html>