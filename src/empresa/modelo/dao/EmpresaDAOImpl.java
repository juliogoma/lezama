/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo.dao;

import HibernateUtil.HibernateUtil;
import empresa.modelo.Empresa;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JULIOCESAR
 */
public class EmpresaDAOImpl implements EmpresaDAO {

    private Session sesion;
    private Transaction tx;

    @Override
    public void openSession() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    @Override
    public boolean guardar(Empresa empresa) throws HibernateException {
        // TODO Auto-generated method stub
        boolean ban;

        try {
            openSession();
            if (empresa.getId() == null) {
                sesion.save(empresa);
                ban = true;


            } else {
                sesion.update(empresa);
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
    public Empresa eliminar(int id) {
        try {
            openSession();
            Empresa empresa = (Empresa) sesion.load(Empresa.class, id);
            if (empresa != null) {
                sesion.delete(empresa);
            }
            tx.commit();
            return empresa;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    @Override
    public Empresa buscarid(int id) {
        try {
            openSession();
            return (Empresa) sesion.get(Empresa.class, id);
        } finally {
            sesion.close();
        }
    }

    @Override
    public Empresa buscarempresa(String razsocial) {
        Empresa empresa = null;
        try {
            openSession();
            Query query = sesion
                    .createQuery("from Empresa u Where u.razsocial = :bdrazsocial");
            query.setParameter("bdrazsocial", razsocial);
            empresa = (Empresa) query.uniqueResult();

        } finally {
            sesion.close();
        }

        return empresa;
    }

    @Override
    public ArrayList<Empresa> listar() {
        ArrayList<Empresa> lista = null;
        try {
            openSession();
            lista = (ArrayList<Empresa>) sesion.createQuery("from Empresa")
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
