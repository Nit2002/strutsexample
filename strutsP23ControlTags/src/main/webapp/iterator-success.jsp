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
<h1>Example of Iterator Tag</h1>

<h4> Employee List </h4>
<s:iterator value="employees">
	<s:property value="name" />
	<s:property value="dept" /><br/>
</s:iterator>

<h4>Employees sorted by Department</h4>
<s:bean name="com.strutsP23ControlTags.model.Iterator.DepartmentComparator" 
    var="deptComparator"  />
    <s:sort comparator="deptComparator" source="employees">
    	<s:iterator>
    		<s:property value="name"/>
    		<s:property value="dept"/><br/>
    	</s:iterator>	
    </s:sort>
    
<h4>Employees working in Recruitment department</h4>
	<s:subset decider="recruitmentDecider" source = "employees">
		<s:iterator>
    		<s:property value="name"/>
    		<s:property value="dept"/><br/>
    	</s:iterator>	
	</s:subset>
    
    
<h4>Employees 2,3 and 4 </h4>    
	<s:subset source="employees" start="1" count="3">
		<s:iterator>
    		<s:property value="name"/>
    		<s:property value="dept"/><br/>
    	</s:iterator>	
	</s:subset>
</body>
</html>