<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> index </title>
<sj:head/> 
</head>
<body>
	
	<h1> Ajax Tags </h1>
	
	
	<sj:tabbedpanel id="remotetabs">
		<sj:tab id="t1" target="tone" label="sj:div" />
		<sj:tab id="t2" target="ttwo" label="sj:autocompleter" />
		<sj:tab id="t3" target="tthree" label="sj:datepicker" />
		
		<sj:div id="tone"> 
			
			<s:url var="url" action="user" />
			<sj:div href="%{url}" delay="5000">
           		Initial Content <br/>
           		wait for 5 second.
         	</sj:div>

		</sj:div>
		 
		<sj:div id="ttwo"> 
			
			<s:form>
			<sj:autocompleter label = "Favourite Colour" list = "{'red','green','blue'}" />
			</s:form>
			
		</sj:div>
		<sj:div id="tthree"> 
			
			<s:form>
			<sj:datepicker name = "deliverydate" label = "Delivery Date"
            displayformat = "dd/MM/yyyy"/>
			</s:form>
			
		</sj:div>

		
		
	</sj:tabbedpanel>
	
	
	<s:url var="u1" action="user1" />
	<s:url var="u2" action="user2" />
	<s:url var="u3" action="user3" />
	<sj:tabbedpanel id="tabs" selectedTab="2">
		<sj:tab id="tab1" href="%{u1}" label="tab 1" />
		<sj:tab id="tab2" href="%{u2}" label="tab 2" />
		<sj:tab id="tab3" href="%{u3}" label="tab 3" />
	</sj:tabbedpanel>
	
</body>
</html>