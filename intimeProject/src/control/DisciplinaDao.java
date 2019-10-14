/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Disciplina;
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
public class DisciplinaDao extends DAO{
        public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Disciplina t = (Disciplina) session.load(Disciplina.class, new Integer(codigo));
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
        
            public static List<Disciplina> ler() {
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
            
  public static List<Disciplina> pesquisa(String nome) {
        List<Disciplina> t = new ArrayList<Disciplina>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
           Criteria cr = session.createCriteria(Disciplina.class);
           cr.add(Restrictions.eq("nome",nome));
           t = (ArrayList<Disciplina>) cr.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
        }
