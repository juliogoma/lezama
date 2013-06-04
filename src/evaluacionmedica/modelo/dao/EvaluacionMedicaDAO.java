/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionmedica.modelo.dao;

import evaluacionmedica.modelo.EvaluacionMedica;
import java.util.ArrayList;
import org.hibernate.HibernateException;

/**
 *
 * @author JULIOCESAR
 */
public interface EvaluacionMedicaDAO {

    public void openSession();

    public boolean guardar(EvaluacionMedica evMedica);

    public EvaluacionMedica eliminar(int id);

    public EvaluacionMedica buscarid(int id);

    public ArrayList<EvaluacionMedica> listar();

    public void manejaExcepcion(HibernateException he);
}
