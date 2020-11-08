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

<table style="width:50%;">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Age</th>
			<th>Gender</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="usersList">
		<tr>
			<td> <s:property value="id"/> </td>
			<td> <s:property value="username"/> </td>
			<td> <s:property value="emailid"/> </td>
			<td> <s:property value="mobileno"/> </td>
			<td> <s:property value="age"/> </td>
			<td> <s:property value="gender"/> </td>
		</tr>
	</s:iterator>
	</tbody>
	
</table>

</body>
</html>