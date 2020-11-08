<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	 <form action="login_action" method="post">
		<label for="Username" > Username :  </label>
		<input type="text" id="Username" name="username1" placeholder="Username" /><br/>
		<label for="Password" > Password :  </label>
		<input type="password" id="Password" name="Password1" placeholder="Password" /><br/>
		<input type="submit" value="Sign In">
	</form> 
	
	
	<%-- <s:form action="login_action" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:password name="password" placeholder="password" label="password"/>
		<s:submit value="Sign In" />
	</s:form> --%>
</body>
</html>