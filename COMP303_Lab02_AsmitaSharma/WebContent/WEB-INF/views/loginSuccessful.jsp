<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <h2>Congrats ! You are logged in successfully.</h2> -->

<form action = "${pageContext.request.contextPath}/checkout.html" method="post">
    
      <table>
      
      <tr>
<td><b><label for="program">Select your Program :</label> </b></td>

<td><select name="program" id="program">
  <option value="Software Engineering">Software Engineering</option>
  <option value="Game Development">Game Development</option>
  <option value="Health Informatics">Health Informatics</option>
  <option value="Robotics">Robotics</option>
</select></td>
</tr>
</table>

<div align="center">
						<input type="submit" value="Checkout" />
					</div>

</form>

</body>
</html>