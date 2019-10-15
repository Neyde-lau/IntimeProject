/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;
import model.Utilizador;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.NewHibernateUtil;

/**
 *
 * @author user
 */
public class UtilizadorDao extends DAO {

    public void apagar(int codigo) {
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Utilizador t = (Utilizador) session.load(Utilizador.class, new Integer(codigo));
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

    public static List<Utilizador> pesquisa(String nome) {
        List<Utilizador> ut = new ArrayList<Utilizador>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Criteria cr = session.createCriteria(Utilizador.class);
            cr.add(Restrictions.eq("nome", nome));
            ut = (ArrayList<Utilizador>) cr.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return ut;
    }
    /*  public static ArrayList<Produto> listarProdutos() {
     Session s = FabricaSessoes.getSessionFactory().openSession();
     ArrayList<Produto> produtos = new ArrayList<>();
     try {
     Transaction t = s.beginTransaction();
     Criteria cr = s.createCriteria(Produto.class);
            
     //            cr.addOrder(Order.desc("quantidade"));
     //            cr.add(Restrictions.eq("quantidade", 35));
     //            cr.add(Restrictions.or(Restrictions.like("nome", "Sumo%"), Restrictions.gt("quantidade", 35)));
     //            cr.add(Restrictions.like("nome", "Sumo%"));
     //            cr.add(Restrictions.gt("quantidade", 35));
     //            cr.add(Restrictions.ge("quantidade",21));

     produtos = (ArrayList<Produto>) cr.list();
     t.commit();
     return produtos;
     } catch (Exception ex) {
     System.out.println("Erro: " + ex);
     return null;
     } finally {
     s.close();
     }
     }*/

    public boolean autenticarUtilizador(String nome, String senha) {
        List<Utilizador> ut = new ArrayList<Utilizador>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Criteria cr = session.createCriteria(Utilizador.class);
            cr.add(Restrictions.eq("nome", nome));
            cr.add(Restrictions.eq("senha", senha));
            Utilizador u = (Utilizador) cr.uniqueResult();
            if (u.getNome().equals(nome) && u.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Credenciais correctas!");
            } else {
                JOptionPane.showMessageDialog(null, "Nome ou Senha incorrectos!");
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return false;
    }
        public String buscarCategoria(String nome, String senha) {
        List<Utilizador> ut = new ArrayList<Utilizador>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            Criteria cr = session.createCriteria(Utilizador.class);
            cr.add(Restrictions.eq("entidade", nome));
            cr.add(Restrictions.eq("senha", senha));
            Utilizador u = (Utilizador) cr.uniqueResult();

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }
}
