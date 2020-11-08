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
	 <form action="user_action" method="post">
		<label  > Username :  </label>
		<input type="text" name="username" placeholder="Username" /><br/>
		<label > Password :  </label>
		<input type="password" name="Password" placeholder="Password" /><br/>
		<input type="submit" value="Sign In">
	</form> 
	
	
	<%-- <s:form action="login_action" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:password name="password" placeholder="password" label="password"/>
		<s:submit value="Sign In" />
	</s:form> --%>
</body>
</html>