/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo.dao;

import empresa.modelo.Empresa;
import java.util.ArrayList;
import org.hibernate.HibernateException;

/**
 *
 * @author JULIOCESAR
 */
public interface EmpresaDAO {

    public void openSession();

    public boolean guardar(Empresa empresa);

    public Empresa eliminar(int id);

    public Empresa buscarid(int id);

    public Empresa buscarempresa(String razsocial);

    public ArrayList<Empresa> listar();

    public void manejaExcepcion(HibernateException he);
}
