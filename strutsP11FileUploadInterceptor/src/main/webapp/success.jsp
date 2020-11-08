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
<h1>
Username <s:property value="username"/></h1><br/>
<p><b>Mobile No <s:property value="mobileno"/><br/>
Email <s:property value="emailid"/><br/>
Age <s:property value="age"/><br/>
Gender <s:property value="gender"/><br/>
image name <s:property value="userimageFileName" /><br/>
image Content Type <s:property value="userimageContentType" /><br/>
image File Path <s:property value="filePath" /><br/>
</b></p>
 Images :<br/> <img alt="path" src="user_image/<s:property value="userimageFileName"/>"  width="300" height="200" />  
  <img alt="id" src="userimage?id=<s:property value="id"/>"   width="300" height="200" />  
  <img alt="base64" src="data:image/*;base64,<s:property value="imageByte"/>"   width="300" height="200" />  
</body>
</html>