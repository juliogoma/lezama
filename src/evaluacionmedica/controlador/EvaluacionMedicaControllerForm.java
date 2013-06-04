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
public class EvaluacionMedicaControllerForm extends ActionSupport {

    private Integer id;
    EvaluacionMedicaDAO interfaz;
    ArrayList<EvaluacionMedica> lista = new ArrayList<EvaluacionMedica>();
    String msj = "";
    EvaluacionMedica evMedica = new EvaluacionMedica();

    public EvaluacionMedicaControllerForm() {
        interfaz = new EvaluacionMedicaDAOImpl();
    }

    public String mostrarFormulario() {
        if (id != null) {
            evMedica = new EvaluacionMedica();
        }
        return SUCCESS;
    }

    public String listar() {
        lista = interfaz.listar();
        return SUCCESS;
    }

    public String eliminar() {
        evMedica = interfaz.eliminar(id);
        id = null;
        msj = "evMedica Eliminado " + evMedica.getId();
        addActionMessage(msj);
        listar();
        return SUCCESS;
    }

    public String buscarProto() {

        evMedica = interfaz.buscarid(id);
        if (evMedica == null) {

            addActionError("No se encontro el Empresa");
            listar();
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public EvaluacionMedica getEvMedica() {
        return evMedica;
    }

    public void setEvMedica(EvaluacionMedica evMedica) {
        this.evMedica = evMedica;
    }
    
}
