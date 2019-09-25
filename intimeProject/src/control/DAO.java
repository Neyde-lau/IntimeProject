/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import hiber.entity.Docente;
import hiber.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author user
 * @param <T>
 */
public class DAO<T> {

    public boolean gravar(T t) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {

            sec.save(t);
            tx.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            sec.close();
        }
    }
     public void actualizar(T t) {
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(t);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Docente t = (Docente) session.load(Docente.class, new Integer(codigo)); //rever de modo que usando generics funcione para todas classes
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
        public List<T> ler() {
        List<T> t = new ArrayList<T>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            t = session.createQuery("from Docente").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
        
          public T Pesquisa(String nome) {
        T t = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Docente where nome = :nomeDocente";
            Query query = session.createQuery(queryString);
            query.setString("nomeDocente", nome);
            t = (T) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
}