<%-- 
    Document   : Login
    Created on : Sep 14, 2015, 8:49:55 PM
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Funcionarios - Login</title>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>Funcionario: Autentique aqui</h1>
            <hr>
            <form action="acao/Conexao" class="text-center" method="POST" style="width: 200px">
                <input type="hidden" name="cmd" value="auth">
                <label><strong>matricula: </strong></label>
                <input type="text" name="matricula" required class="form-control"><br>
                <input type="submit" value="autenticar" class="btn btn-sm btn-success btn-block">
            </form>
            <hr>
            <em>Não tem cadastro?</em>
            <a href="Cadastrar.jsp">clique aqui</a>
        </div>
    </body>
</html>
