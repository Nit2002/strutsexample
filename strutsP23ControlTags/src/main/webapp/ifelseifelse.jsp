<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
	   <h1>Hello World From Struts2</h1>
      <form action = "if_elseif_else">
         <label for = "name">Please pick a name</label><br/>
         <select name = "username">
            <option value = "Manish">Manish</option>
            <option value = "Ganesh">Ganesh</option>
            <option value = "Ram">Ram</option>
         </select>
         <input type = "submit" value = "Submit"/>
      </form>
</body>
</html>