/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.ArrayList;
import java.util.List;
import model.Docente;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.NewHibernateUtil;

/**
 *
 * @author user
 */
public class DocenteDao extends DAO{
    public static List<Docente> ler() {
        List<Docente> t = new ArrayList<Docente>();
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

                 public static List<Docente> lerRegente() {
        List<Docente> doc = new ArrayList<Docente>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
           Criteria cr = session.createCriteria(Docente.class);
           cr.add(Restrictions.eq("categoria","Regente"));
           doc = (ArrayList<Docente>) cr.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return doc;
    }
        public static List<Docente> lerAssistente() {
        List<Docente> doc = new ArrayList<Docente>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
           Criteria cr = session.createCriteria(Docente.class);
           cr.add(Restrictions.eq("categoria","Assistente"));
           doc = (ArrayList<Docente>) cr.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return doc;
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
    
        public static List<Docente> pesquisa(String nome) {
        List<Docente> doc = new ArrayList<Docente>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
           Criteria cr = session.createCriteria(Docente.class);
           cr.add(Restrictions.eq("nome",nome));
           doc = (ArrayList<Docente>) cr.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return doc;
    }
}
