<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="conversiones.Ingredientes"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados</title>
</head>
<body>
<h1>Lista de compras</h1>
<%
String n1=request.getParameter("num1");
String n2=request.getParameter("num2");

Ingredientes i = new Ingredientes();
i.convertirHarina();

%>
</body>
</html>