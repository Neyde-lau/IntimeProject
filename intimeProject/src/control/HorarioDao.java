/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Horario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author Paula Sigauque
 */
public class HorarioDao extends DAO {

   public List<Horario> ler() {
        List<Horario> t = new ArrayList<Horario>();
        Transaction tran = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tran = session.beginTransaction();
            t = session.createQuery("from HOrario where codigoTurma= :codigoTurma").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return t;
    }
    
    
    
}
