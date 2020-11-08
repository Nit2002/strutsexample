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

	  <s:url var = "indexEN" namespace="/" action = "locale" >
         <s:param name = "request_locale" >en</s:param>
      </s:url>
      
      <s:url var = "indexHI" namespace="/" action = "locale" >
         <s:param name = "request_locale" >hi</s:param>
      </s:url>
      
      <s:url var = "indexMR" namespace="/" action = "locale" >
         <s:param name = "request_locale" >mr</s:param>
      </s:url>

      <s:a href="%{indexEN}" >English</s:a>
      <s:a href="%{indexHI}" >Hindi</s:a>
      <s:a href="%{indexMR}" >Marathi</s:a>

	 <form action="login_action" method="post">
		<label  > Username :  </label>
		<input type="text" name="username" placeholder="<s:property value = "getText('global.Username')" />" /><br/>
		<label > Password :  </label>
		<input type="password" name="Password" placeholder="<s:property value = "getText('global.password')" />" /><br/>
		<label > Language Code :  </label>
		<input type="text" name="request_code" placeholder="<s:property value = "getText('global.lang')" />" /><br/>
		<input type="submit" value="<s:property value = "getText('global.signin')" />">
	</form> 
	
	
	<%-- <s:form action="login_action" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:password name="password" placeholder="password" label="password"/>
		<s:submit value="Sign In" />
	</s:form> --%>
</body>
</html>