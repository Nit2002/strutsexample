<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tiles-extras" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> <tiles:getAsString name="title" /> </title>
</head>
<body>

	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body" />
	<jsp:include page="footer.jsp" />
	
</body>
</html>