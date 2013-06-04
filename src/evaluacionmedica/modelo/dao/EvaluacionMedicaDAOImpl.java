/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionmedica.modelo.dao;

import HibernateUtil.HibernateUtil;
import evaluacionmedica.modelo.EvaluacionMedica;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JULIOCESAR
 */
public class EvaluacionMedicaDAOImpl implements EvaluacionMedicaDAO {

    private Session sesion;
    private Transaction tx;

    @Override
    public void openSession() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    @Override
    public boolean guardar(EvaluacionMedica evMedica) throws HibernateException {
        // TODO Auto-generated method stub
        boolean ban;

        try {
            openSession();
            if (evMedica.getId() == null) {
                sesion.save(evMedica);
                ban = true;


            } else {
                sesion.update(evMedica);
                ban = false;
            }
            tx.commit();
            return ban;

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;

        } finally {
            sesion.close();
        }
    }

    @Override
    public EvaluacionMedica eliminar(int id) {
        try {
            openSession();
            EvaluacionMedica evMedica = (EvaluacionMedica) sesion.load(EvaluacionMedica.class, id);
            if (evMedica != null) {
                sesion.delete(evMedica);
            }
            tx.commit();
            return evMedica;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    @Override
    public EvaluacionMedica buscarid(int id) {
        try {
            openSession();
            return (EvaluacionMedica) sesion.get(EvaluacionMedica.class, id);
        } finally {
            sesion.close();
        }
    }

    @Override
    public ArrayList<EvaluacionMedica> listar() {
         ArrayList<EvaluacionMedica> lista = null;
        try {
            openSession();
            lista = (ArrayList<EvaluacionMedica>) sesion.createQuery("from EvaluacionMedica")
                    .list();
            tx.commit();
        } finally {
            sesion.close();
        }
        return lista;
    }

    @Override
    public void manejaExcepcion(HibernateException he) {
         tx.rollback();
        throw new HibernateException(
                "Ocurrio un error en la capa de acceso a datos", he);
    }
}
