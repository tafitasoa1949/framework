<%-- 
    Document   : index
    Created on : 4 avr. 2023, 10:55:30
    Author     : Tafitasoa-P15B-140
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajouter Personne</h1>
        <form action="ajout_pers" method="get">
            <p>Nom : <input type="text" name="nom"></p>
            <p> Age : <input type="number" name="age"></p>
            <p>Dtn : <input type="date" name="daty"></p>
            <input type="submit" value="Enregistrer">
        </form>
        <a href="listdepartement">List dept</a>
        <br>
        <a href="modifierPersonne?id=35">Ajouter personne</a>
    </body>
</html>
