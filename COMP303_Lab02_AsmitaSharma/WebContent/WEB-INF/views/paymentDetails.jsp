<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
         
   Cookie studentID = new Cookie("studentID",
 			  request.getParameter("studentID"));
   
 
   
studentID.setMaxAge(60*60*10); 
  
 
   // Add both the cookies in the response header.
   response.addCookie( studentID );

%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h2>Student ID : ${studentID}</h2> --%>


<h2>Program : ${program}</h2>

</body>
</html>