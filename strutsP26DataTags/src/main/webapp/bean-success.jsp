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
	<h1>Bean Tag</h1>

	<s:bean name="org.apache.struts2.util.Counter" var="counter">
		<s:param name="first" value="20" />
		<s:param name="last" value="40" />
	</s:bean>
	
	
	<s:iterator value="counter"> <!--  %{counter}, #counter, %{#counter}  -->
		<s:property /><br/>
	</s:iterator>

</body>
</html>