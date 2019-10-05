/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.ArrayList;
import java.util.List;
import model.Disciplina;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 * 
 * @author user
 */
public class DisciplinaDao extends DAO{
        public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Disciplina t = (Disciplina) session.load(Disciplina.class, new Integer(codigo)); //rever de modo que usando generics funcione para todas classes
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
        
            public List<Disciplina> ler() {
        List<Disciplina> t = new ArrayList<Disciplina>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            t = session.createQuery("from Disciplina").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
            
                public Disciplina Pesquisa(String nome) {
        Disciplina d = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Disciplina where nome = :nome";
            Query query = session.createQuery(queryString);
            query.setString("nome", nome);
            d = (Disciplina) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return d;
    }
        }
