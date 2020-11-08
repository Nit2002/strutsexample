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
<p>Message : <s:text name="login.msg"></s:text></p>
<p><s:property value = "getText('login.msg')" /></p>
<s:i18n name = "com.strutsP17i18nInterceptor.model">
   <s:text name = "login.msg" />
</s:i18n>
</body>
</html>