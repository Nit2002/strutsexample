<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1>
User name  <%= request.getAttribute("username") %>  </h1><br/>
<p><b>Mobile No <%= request.getAttribute("mobileno") %><br/>
Email <%= request.getAttribute("emailid") %><br/>
Age <%= request.getAttribute("age") %><br/>
Gender <%= request.getAttribute("gender") %><br/>
image name <%= request.getAttribute("userimageFileName") %><br/>
image Content Type <%= request.getAttribute("userimageContentType") %><br/>
image File Path <%= request.getAttribute("filePath") %><br/>
</b></p>
 Images :<br/> <img alt="path" src="user_image/<%= request.getAttribute("userimageFileName") %>"  width="300" height="200" />  
  <img alt="id" src="userimage?id=<%= request.getAttribute("id") %>"   width="300" height="200" />  
  <img alt="base64" src="data:image/*;base64,<%= request.getAttribute("imageByte") %>"   width="300" height="200" />  
</body>
</html>