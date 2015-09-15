<%-- 
    Document   : Cadastrar
    Created on : Sep 14, 2015, 8:54:18 PM
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Funcionarios - Cadastro</title>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>Funcionario: cadastre-se aqui</h1>
            <hr>
            <form action="acao/Conexao" method="POST" style="width: 250px">
                <input type="hidden" name="cmd" value="cad">
                <label><strong>matricula: </strong></label>
                <input type="text" name="matricula" required class="form-control"><br>
                <label><strong>Nome: </strong></label>
                <input type="text" name="nome" required class="form-control"><br>
                
                <label><strong>Endereço: </strong></label>
                <input type="text" name="endereco" required class="form-control"><br>
                <label><strong>Telefone: </strong></label>
                <input type="text" name="telefone" required class="form-control"><br>
                
                <input type="submit" value="salvar" class="btn btn-block btn-sm btn-success">
            </form>
        </div>
    </body>
</html>
