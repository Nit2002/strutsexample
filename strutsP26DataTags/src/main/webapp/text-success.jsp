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
	<h1>Text Tag</h1>

	<s:i18n name="user_action">
		<s:text name="name.success" /><br/>
		<s:text name="name.abc" >Message doesn't exists</s:text><br/>
		<s:text name="name.msg.param"><br/>
			<s:param>Manish</s:param>
		</s:text>
	</s:i18n>


</body>
</html>