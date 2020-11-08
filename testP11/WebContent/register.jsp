<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	 <form action="register" method="post" enctype="multipart/form-data">
		<label for="Username" > User name :  </label>
		<input type="text" id="Username" name="username" placeholder="Username" /><br/>
		<label for="MobileNo" > MobileNo :  </label>
		<input type="tel" id="MobileNo" name="mobileno" placeholder="MobileNo" /><br/>
		<label for="EmailId" > EmailId :  </label>
		<input type="email" id="EmailId" name="emailid" placeholder="EmailId" /><br/>
		<label for="Age" > Age :  </label>
		<input type="number" id="Age" name="age" placeholder="Age" /><br/>
		<label  > Gender :  </label>
		<input  type="radio" id="r1" name="gender" value="male" /><label for="r1">Male</label>
		<input  type="radio" id="r2" name="gender" value="female" /><label for="r2">Female</label><br/>
		<br/><label for="userimage" > User Image :  </label>
		<input type="file" id="userimage" name="userimage" placeholder="User Image"><br/>
		<input type="submit" value="Sign Up">
	</form>
</body>
</html>