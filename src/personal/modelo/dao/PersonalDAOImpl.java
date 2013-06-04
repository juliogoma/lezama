/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.modelo.dao;

import HibernateUtil.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import personal.modelo.Personal;

/**
 *
 * @author JULIOCESAR
 */
public class PersonalDAOImpl implements PersonalDAO {

    private Session sesion;
    private Transaction tx;

    @Override
    public void openSession() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    @Override
    public boolean guardar(Personal personal) throws HibernateException {
        // TODO Auto-generated method stub
        boolean ban;

        try {
            openSession();
            if (personal.getId() == null) {
                sesion.save(personal);
                ban = true;


            } else {
                sesion.update(personal);
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
    public Personal eliminar(int id) {
        try {
            openSession();
            Personal personal = (Personal) sesion.load(Personal.class, id);
            if (personal != null) {
                sesion.delete(personal);
            }
            tx.commit();
            return personal;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    @Override
    public Personal buscarid(int id) {
        try {
            openSession();
            return (Personal) sesion.get(Personal.class, id);
        } finally {
            sesion.close();
        }
    }

    @Override
    public Personal buscarpersonal(String nombre) {
        Personal personal = null;
        try {
            openSession();
            Query query = sesion
                    .createQuery("from Personal u Where u.nombre = :bdnombre");
            query.setParameter("bdnombre", nombre);
            personal = (Personal) query.uniqueResult();

        } finally {
            sesion.close();
        }

        return personal;
    }

    @Override
    public ArrayList<Personal> listar() {
        ArrayList<Personal> lista = null;
        try {
            openSession();
            lista = (ArrayList<Personal>) sesion.createQuery("from Personal")
                    .list();
            tx.commit();
        } finally {
            sesion.close();
        }
        return lista;
    }

    @Override
    public void manejaExcepcion(HibernateException he) throws HibernateException {
        // TODO Auto-generated method stub
        tx.rollback();
        throw new HibernateException(
                "Ocurrio un error en la capa de acceso a datos", he);

    }
}
