<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
		<s:actionerror/>
	 <form action="register" method="post">
		<label for="Username" > Username :  </label>
		<input type="text" id="Username" name="username" placeholder="Username" /><br/>
		<label for="MobileNo" > MobileNo :  </label>
		<input type="tel" id="MobileNo" name="mobileno" placeholder="MobileNo" /><br/>
		<label for="EmailId" > EmailId :  </label>
		<input type="email" id="EmailId" name="emailid" placeholder="EmailId" /><br/>
		<label for="Age" > Age :  </label>
		<input type="number" id="Age" name="Age" placeholder="Age" /><br/>
		<label  > Gender :  </label>
		<input  type="radio" id="r1" name="gender" value="male" /><label for="r1">Male</label>
		<input  type="radio" id="r2" name="gender" value="female" /><label for="r2">Female</label><br/>
		<input type="submit" value="Sign Up">
	</form>
	
	
	<%-- <s:form action="register" method="post">
		<s:textfield name="username" placeholder="Username" label="Username"/>
		<s:textfield name="mobileno" placeholder="MobileNo" label="MobileNo"/>
		<s:textfield name="emailid" placeholder="EmailId" label="EmailId"/>
		<s:textfield name="Age" placeholder="Age" label="Age"/>
		<s:radio list ="{'male','female'}" name="Gender" label="Gender" />
		<s:submit value="Sign Up" />
	</s:form> --%>
</body>
</html>