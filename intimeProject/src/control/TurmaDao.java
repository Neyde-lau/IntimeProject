/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Turma;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author user
 */
public class TurmaDao {
      public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Turma t = (Turma) session.load(Turma.class, new Integer(codigo)); //rever de modo que usando generics funcione para todas classes
            session.delete(t);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (tran != null) {
                tran.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }


    public List<Turma> ler() {
        List<Turma> t = new ArrayList<Turma>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            t = session.createQuery("from Turma").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }

   /** public Turma Pesquisa(String nome) {
        Turma t = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Turma where curso = :curso";
            Query query = session.createQuery(queryString);
            query.setString("nome", nome);
            t = (Turma) query.uniqueResult();
            
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
    */
}
