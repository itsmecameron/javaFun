<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New file JSP</title>
</head>
<body>
	<% for(int index = 0; index < 5; index++){ %>
		<h1><%= index %></h1>
	<% } %>
</body>
</html>