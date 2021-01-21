<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrollment</title>
</head>
<body>

<!--  FORM 1  "Registration" -->

<div style="width:50%; margin:auto;float:left;">
  <div style="display:inline-block; width:45%;text-align:center;">
  
    <form action = "${pageContext.request.contextPath}/register.html" method="post">
    
      <table>
      
      <tr>
<td><b>Student ID</b></td>
							<td><input type="text" name="studentID" required//></td>
</tr>
<tr>
<td><b>First Name</b></td>
							<td><input type="text" name="firstname" required//></td>
</tr>


<tr>
<td><b>Last Name</b></td>
							<td><input type="text" name="lastname" required/></td>

</tr>
<tr>
<td><b>Adress City</b></td>
							<td><input type="text" name="city" required//></td>
</tr>
<tr>
<td><b>Postal Code</b></td>
							<td><input type="text" name="postalcode" required//></td>
</tr>
<tr>
<td><b>Username</b></td>
							<td><input type="text" name="username" required//></td>
</tr>
<tr>
<td><b>Password</b></td>
							<td><input type="text" name="password" required//></td>
</tr>
</table>
<div align="center">
						<input type="submit" value="Submit" />
					</div>
    </form>
  </div>
</div>

<!--  FORM 2  "Login" -->

<div style="width:50%; margin:auto;float:Right;">
  <div style="display:inline-block; width:45%;text-align:center;">
  
    <form action = "${pageContext.request.contextPath}/login.html" method="post">
    
      <table>
      
      <tr>
<td><b>Student ID</b></td>
							<td><input type="text" name="studentID"  required//></td>
</tr>
      
<tr>
<td><b>Username</b></td>
							<td><input type="text" name="username" required//></td>
</tr>


<tr>
<td><b>Password</b></td>
							<td><input type="text" name="password" required/></td>

</tr>
</table>
<div align="center">
						<input type="submit" value="Login" />
					</div>
    </form>
  </div>
</div>

</body>
</html>