<%-- 
    Document   : test
    Created on : 9 mai 2023, 05:16:00
    Author     : Tafitasoa-P15B-140
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ETU2059.framework.models.Personne" %>
<% int id  =  (int) request.getAttribute("id"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        id : <% out.println(id); %>
    </body>
</html>
