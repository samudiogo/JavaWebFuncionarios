/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import dao.FuncionarioDAO;

/**
 *
 * @author samue
 */
@WebServlet(urlPatterns = "/acao/Conexao")
public class FuncionarioConexao extends HttpServlet
{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String cmd  = req.getParameter("cmd");
        FuncionarioDAO dao = new FuncionarioDAO();
        switch(cmd)
        {
            case "cad":
                dao.Cadastra(new Funcionario(
                        req.getParameter("matricula"),
                        req.getParameter("nome"),
                        req.getParameter("endereco"),req.getParameter("telefone")));
                resp.sendRedirect("../Home.jsp");
                break;
            case "auth":
                dao.Autentica(req.getParameter("matricula"));
                resp.sendRedirect("../Home.jsp");
                break;
            default:
                resp.sendRedirect("../Login.jsp");
                break;
        }
        
    }
    
    
    
}
