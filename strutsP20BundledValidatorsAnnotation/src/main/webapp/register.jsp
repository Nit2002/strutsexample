<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<STYLE type="text/css">  
.errorMessage{color:red;}  
</STYLE>  
</head>
<body>
	<s:actionerror/>

	  
	 
	  <form action="register" method="post">
		<label for="username" > Username :  </label>
		<input type="text" id="username" name="username" placeholder="Username" value="${username}" />
		<s:fielderror fieldName="username"/><br/>
		<label for="mobileno" > MobileNo :  </label>
		<input type="tel" id="mobileno" name="mobileno" placeholder="MobileNo" value="${mobileno}" />
		<s:fielderror fieldName="mobileno"/><br/>
		<label for="emailid" > EmailId :  </label>
		<input type="email" id="emailid" name="emailid" placeholder="EmailId" value="${emailid}" />
		<s:fielderror fieldName="emailid"/><br/>
		<label for="age" > Age :  </label>
		<input type="number" id="age" name="age"  placeholder="Age" step="1" value="${age}" />
		<s:fielderror fieldName="age"/><br/>
		<label for="height" > Height :  </label>
		<input type="number" id="height" name="height"  placeholder="Height" step="0.5" value="${height}" />
		<s:fielderror fieldName="height"/><br/>
		<label for="dob" > DOB :  </label>
		<input type="text" id="dob" name="dob"  placeholder="DOB" value="<s:property value="dob"/>" />
		<s:fielderror fieldName="dob"/><br/>
		<label for="url" > URL :  </label>
		<input type="text" id="url" name="url"  placeholder="URL" value="${url}" />
		<s:fielderror fieldName="url"/><br/>
		<label for="password" > Password :  </label>
		<input type="password" id="password" name="password"  placeholder="Password" value="${password}" />
		<s:fielderror fieldName="password"/><br/>
		<label for="cPassword" > Confirm Password :  </label>
		<input type="password" id="cPassword" name="cPassword"  placeholder="Confirm Password" value="${cPassword}" />
		<s:fielderror fieldName="cPassword"/><br/>
		<label  > Gender :  </label>
		<input  type="radio" id="r1" name="gender" value="male" <% if( (request.getParameter("gender")+" ").equals("male ") ) {%> checked="checked" <%}%>  /><label for="r1">Male</label>
		<input  type="radio" id="r2" name="gender" value="female" <% if( (request.getParameter("gender")+" ").equals("female ") ) {%> checked="checked" <%}%> /><label for="r2">Female</label>
		<s:fielderror fieldName="gender"/><br/>
		<input type="submit" value="Sign Up">
	</form>   
	  
	
  <!-- 	<s:form action="register" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:textfield name="mobileno" placeholder="MobileNo" label="MobileNo"/>
		<s:textfield name="emailid" placeholder="EmailId" label="EmailId"/>
		<s:textfield name="age" placeholder="Age" label="Age"/>
		<s:textfield name="height" placeholder="Height" label="Height"/>
		<s:textfield name="dob" placeholder="Dob" label="Dob"/>
		<s:textfield name="url" placeholder="Url" label="Url"/>
		<s:password name="password" placeholder="Password" label="Password"/>
		<s:password name="cPassword" placeholder="CPassword" label="Confirm Password"/>
		<s:radio list ="{'male','female'}" name="Gender" label="Gender" />
		<s:submit value="Sign Up" />
	</s:form>  -->
	
	
</body>
</html>