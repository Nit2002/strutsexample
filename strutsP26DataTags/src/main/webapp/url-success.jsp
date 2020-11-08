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
	<h1>Url Tag</h1>

	<s:url  action = "login" var = "myurl">
        <s:param name = "user">Manish</s:param>
     </s:url>
     
      <a href = '<s:property value = "#myurl"/>'>
     <s:property value = "#myurl"/></a>
     
	
	<pre>
    

	
	<s:url value = "editGadget.action">
	   <s:param name = "id" value = "%{selected}" />
	</s:url>
	
	
	<s:url action = "editGadget">
	   <s:param name = "id" value = "%{selected}" />
	</s:url>
	
	
	<s:url includeParams="get">
	   <s:param name = "id" value = "%{'22'}" />
	</s:url>
	</pre>
</body>
</html>