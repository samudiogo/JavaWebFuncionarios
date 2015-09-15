/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Funcionario;

/**
 *
 * @author samuel
 */
public class FuncionarioDAO
{

    public void Cadastra(Object func)
    {
        try
        {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(func);
            utx.commit();
        } catch (Exception e)
        {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Funcionario ConsultaPorMatricula(String matricula)
    {
        try
        {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            Query q = em.createQuery("Select f from Funcionario f where matricula like '"+matricula+"'");
            return (Funcionario) q.getSingleResult();
        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Funcionario> ListaFuncionarios()
    {
        try
        {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            Query q = em.createQuery("select f FROM Funcionario f");
            List<Funcionario> funcionarios = new ArrayList<>();
            funcionarios = q.getResultList();
            utx.commit();
            return  funcionarios;
        } catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
        
    }

    public Funcionario Autentica(String Matricula)
    {
        return new Funcionario();
    }
}
