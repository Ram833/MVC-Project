<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<marquee behaviour ="alternate" scrollamount="20">
<font size="7" color="blue"><center>You are Successfully Login</center></font></marquee>
<%
 String name = (String)session.getAttribute("Name");
 out.println(name);
%>
</body>
</html>