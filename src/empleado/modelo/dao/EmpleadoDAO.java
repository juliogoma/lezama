/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado.modelo.dao;

import empleado.modelo.Empleado;
import java.util.ArrayList;
import org.hibernate.HibernateException;

/**
 *
 * @author JULIOCESAR
 */
public interface EmpleadoDAO {
     public void openSession();

    public boolean guardar(Empleado empleado);

    public Empleado eliminar(int id);

    public Empleado buscarid(int id);

    public Empleado buscarempleado(String nombre);

    public ArrayList<Empleado> listar();

    public void manejaExcepcion(HibernateException he);
}
