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
<h1>Welcome <s:property value="username"/></h1>

<s:if test=" username == 'Ram'  ">
	You have selected 'Ram'. 
</s:if>
<s:elseif test=" username == 'Ganesh'">
	You have selected 'Ganesh'. 
</s:elseif>
<s:else>
	You have selected 'Manish'. 
</s:else>

</body>
</html>