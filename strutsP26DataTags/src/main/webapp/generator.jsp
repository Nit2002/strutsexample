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


<s:generator val="%{'Violet, Indigo, Blue, Green, Yellow, Orange, Red' }" 
	separator="," > <%-- count = "7"  --%>
	<s:iterator>
		<s:property /><br/>
	</s:iterator>
</s:generator>


</body>
</html>