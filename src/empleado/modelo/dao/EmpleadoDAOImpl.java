/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado.modelo.dao;

import HibernateUtil.HibernateUtil;
import empleado.modelo.Empleado;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JULIOCESAR
 */
public class EmpleadoDAOImpl implements EmpleadoDAO {

    private Session sesion;
    private Transaction tx;

    @Override
    public void openSession() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    @Override
    public boolean guardar(Empleado empleado) throws HibernateException {
        boolean ban;
        try {
            openSession();
            if (empleado.getId() == null) {
                sesion.save(empleado);
                ban = true;

            } else {
                sesion.update(empleado);
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
    public Empleado eliminar(int id) {
        try {
            openSession();
            Empleado empleado = (Empleado) sesion.load(Empleado.class, id);
            if (empleado != null) {
                sesion.delete(empleado);
            }
            tx.commit();
            return empleado;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    @Override
    public Empleado buscarid(int id) {
        try {
            openSession();
            return (Empleado) sesion.get(Empleado.class, id);
        } finally {
            sesion.close();
        }
    }

    @Override
    public Empleado buscarempleado(String nombre) {
        Empleado empleado = null;
        try {
            openSession();
            Query query = sesion
                    .createQuery("from Empleado u Where u.nombre = :bdnombre");
            query.setParameter("bdnombre", nombre);
            empleado = (Empleado) query.uniqueResult();

        } finally {
            sesion.close();
        }

        return empleado;
    }

    @Override
    public ArrayList<Empleado> listar() {
        ArrayList<Empleado> lista = null;
        try {
            openSession();
            lista = (ArrayList<Empleado>) sesion.createQuery("from Empleado") // pongo eso si es que no pongo lazy en el mapeo entiedes?  >>>> FROM Usuario u inner join fetch u.lenguajepreferido
                    .list();
            tx.commit();
        } finally {
            sesion.close();
        }
        return lista;
    }

    @Override
    public void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException(
                "Ocurrio un error en la capa de acceso a datos", he);
    }
}
