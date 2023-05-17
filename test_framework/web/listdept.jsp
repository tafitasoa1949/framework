<%-- 
    Document   : listdept
    Created on : 4 avr. 2023, 10:39:32
    Author     : Tafitasoa-P15B-140
--%>
<%@page import="java.util.Vector"%>
<%@page import="ETU2059.framework.models.Dept" %>
<% Vector<Dept> v = (Vector<Dept>) request.getAttribute("li"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>List departement!</h1>
        <hr>
        <% for(int i=0 ; i < v.size() ; i++) { %>
            <% out.println(v.get(i).getNom()); %>
            <% out.println(v.get(i).getSalaire()); %>
        <% } %>
    </body>
</html>
