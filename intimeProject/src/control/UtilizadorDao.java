/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import model.Utilizador;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author user
 */
public class UtilizadorDao extends DAO {
        public Utilizador Pesquisa(String nome) {
        Utilizador u = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Docente where nome = :nomeDocente";
            Query query = session.createQuery(queryString);
            query.setString("nome", nome);
            u = (Utilizador) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return u;
    }
        
            public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Utilizador t = (Utilizador) session.load(Utilizador.class, new Integer(codigo)); //rever de modo que usando generics funcione para todas classes
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
          public List<Utilizador> ler() {
        List<Utilizador> t = new ArrayList<Utilizador>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            t = session.createQuery("from Utilizador").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }  
      public boolean autenticarUtilizador(String nome, String senha) {
        {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                List<?> lst = session.createQuery("from utilizador").list();
                for (Iterator<?> iterator
                        = lst.iterator(); iterator.hasNext();) {
                    Utilizador ut = (Utilizador) iterator.next();
                    if (ut.getNome().equals(nome) && ut.getSenha().equals(senha)) {
                        JOptionPane.showMessageDialog(null, "Credenciais correctas!");
                    } else {
                        JOptionPane.showMessageDialog(null, "nome ou senha incorrectos!");
                    }
                }
                tx.commit();
                return true;
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                e.printStackTrace();
            } finally {
                session.close();
            }
        }
        return false;
    }  
}
