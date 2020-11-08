<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<STYLE type="text/css">  
ul{margin: 0px;}
.errorMessage{color:red;}  
</STYLE>
<sj:head/>  

	<script type="text/javascript" src="${pageContext.request.contextPath}/struts/utils.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/struts/xhtml/validation.js"></script>

</head>
<body>
	<s:actionerror/>

	  
	 <%-- 
	  <s:form  id="myform" action="register" method="post">
		<label for="Username" > Username :  </label>
		<input type="text" id="Username" name="username" placeholder="Username" value="${username}" />
		<s:fielderror fieldName="username"/><br/>
		<label for="MobileNo" > MobileNo :  </label>
		<input type="tel" id="MobileNo" name="mobileno" placeholder="MobileNo" value="${mobileno}" />
		<s:fielderror fieldName="mobileno"/><br/>
		<label for="EmailId" > EmailId :  </label>
		<input type="email" id="EmailId" name="emailid" placeholder="EmailId" value="${emailid}" />
		<s:fielderror fieldName="emailid"/><br/>
		<label for="Age" > Age :  </label>
		<input type="number" id="Age" name="age"  placeholder="Age" step="1" value="${age}" />
		<s:fielderror fieldName="age"/><br/>
		<label for="Height" > Height :  </label>
		<input type="number" id="Height" name="height"  placeholder="Height" step="0.5" value="${height}" />
		<s:fielderror fieldName="height"/><br/>
		<label for="DOB" > DOB :  </label>
		<input type="text" id="DOB" name="dob"  placeholder="DOB" value="<s:property value="dob"/>" />
		<s:fielderror fieldName="dob"/><br/>
		<label for="URL" > URL :  </label>
		<input type="url" id="URL" name="url"  placeholder="URL" value="${url}" />
		<s:fielderror fieldName="url"/><br/>
		<label for="Password" > Password :  </label>
		<input type="password" id="Password" name="password"  placeholder="Password" value="${password}" />
		<s:fielderror fieldName="password"/><br/>
		<label for="CPassword" > Confirm Password :  </label>
		<input type="password" id="CPassword" name="cPassword"  placeholder="CPassword" value="${cPassword}" />
		<s:fielderror fieldName="cPassword"/><br/>
		<label  > Gender :  </label>
		<input  type="radio" id="r1" name="gender" value="male" <% if( (request.getParameter("gender")+" ").equals("male") ) {%> checked="checked" <%}%>  /><label for="r1">Male</label>
		<input  type="radio" id="r2" name="gender" value="female" <% if( (request.getParameter("gender")+" ").equals("female") ) {%> checked="checked" <%}%> /><label for="r2">Female</label>
		<s:fielderror fieldName="gender"/><br/>
		
		<sj:submit validate="true" />
	</s:form> --%>   
	 <%--  <input type="submit" value="Sign Up"> --%>
	
	
  	<s:form id="myform" action="register" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:textfield name="mobileno" placeholder="MobileNo" label="MobileNo"/>
		<s:textfield name="emailid" placeholder="EmailId" label="EmailId"/>
		<s:textfield name="age" placeholder="Age" label="Age"/>
		<s:textfield name="height" placeholder="Height" label="Height"/>
		<s:textfield name="dob" placeholder="Dob" label="Dob"/>
		<s:textfield name="url" placeholder="Url" label="Url"/>
		<s:password name="password" placeholder="Password" label="Password"/>
		<s:password name="cPassword" placeholder="CPassword" label="Confirm Password"/>
		<s:radio list ="{'male','female'}" name="gender" label="Gender" />
		<sj:submit value="Sign Up" validate="true"  />
	</s:form>  
	 
	
	
</body>
</html>