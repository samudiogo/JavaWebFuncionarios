<%-- 
    Document   : Home
    Created on : Sep 14, 2015, 8:58:36 PM
    Author     : samue
--%>
<%@page import="java.util.List"%>
<%@page import="model.Funcionario"%>
<%@page import="dao.FuncionarioDAO"%>
<%
    FuncionarioDAO dao = new FuncionarioDAO();
   
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Funcionarios - Dashboard</title>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>Funcionários - Dashboard</h1>
            <hr>
            <table class="table" style="width: 300px;">
                <thead>
                    <tr>
                        <th>Matricula</th>
                        <th>Nome</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Funcionario f : dao.ListaFuncionarios())
                        {%>
                    <tr><td><%= f.getMatricula()%></td><td><%= f.getNome()%></td></tr>        
                    <%     }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
