/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionmedica.controlador;
import com.opensymphony.xwork2.ActionSupport;
import evaluacionmedica.modelo.EvaluacionMedica;
import evaluacionmedica.modelo.dao.EvaluacionMedicaDAO;
import evaluacionmedica.modelo.dao.EvaluacionMedicaDAOImpl;
import java.util.ArrayList;
/**
 *
 * @author JULIOCESAR
 */
public class EvaluacionMedicaController extends ActionSupport{
    EvaluacionMedica evMedica = new EvaluacionMedica();
    EvaluacionMedicaDAO interfaz;
    ArrayList<EvaluacionMedica> lista = new ArrayList<EvaluacionMedica>();
    String msj = "";
    private Integer id;
     public EvaluacionMedicaController() {
        interfaz = new EvaluacionMedicaDAOImpl();
    }
     public String guardar() throws Exception {
        boolean ban;

        ban = interfaz.guardar(evMedica);
        if (ban = true) {
            msj = "Evaluacion Medica Guardado";
        } else {
            msj = "Evaluacion Medica Modificado";
        }
        return SUCCESS;
    }

    public EvaluacionMedica getEvMedica() {
        return evMedica;
    }

    public void setEvMedica(EvaluacionMedica evMedica) {
        this.evMedica = evMedica;
    }

    public EvaluacionMedicaDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(EvaluacionMedicaDAO interfaz) {
        this.interfaz = interfaz;
    }

    public ArrayList<EvaluacionMedica> getLista() {
        return lista;
    }

    public void setLista(ArrayList<EvaluacionMedica> lista) {
        this.lista = lista;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     
}
