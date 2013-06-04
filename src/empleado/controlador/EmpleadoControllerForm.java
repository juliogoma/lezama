/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado.controlador;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import empleado.modelo.Empleado;
import empleado.modelo.dao.EmpleadoDAO;
import empleado.modelo.dao.EmpleadoDAOImpl;
import empresa.modelo.Empresa;
import empresa.modelo.dao.EmpresaDAO;
import empresa.modelo.dao.EmpresaDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JULIOCESAR
 */
public class EmpleadoControllerForm extends ActionSupport{

    Empleado empleado = new Empleado();
    EmpleadoDAO interfaz;
    EmpresaDAO interfazempresa;
    List<Empleado> lista = new ArrayList<Empleado>();
    List<Empresa> listaempresa = new ArrayList<Empresa>();
    String msj = "";
    private Integer id;
    private String nombre;

    private void prepcombo() {
        listaempresa = interfazempresa.listar();
        Map session = ActionContext.getContext().getSession();
        session.put("listaempresa", listaempresa);
    }

    public EmpleadoControllerForm() {
        interfaz = new EmpleadoDAOImpl();
        interfazempresa = new EmpresaDAOImpl();
    }

    public String listar() {
        lista = interfaz.listar();
        return SUCCESS;
    }

    public String eliminar() {
        empleado = interfaz.eliminar(id);
        id = null; // parche 03/03/2012 --> conflicto con la vista list, se tuvo
        // q dejar en null el id para la prox. eliminada
        msj = "usuario Eliminado " + empleado.getNombre();
        addActionMessage(msj);
        listar();
        return SUCCESS;
    }

    public String mostrarFormulario() {
        prepcombo();
        if (id != null) {
            empleado = new Empleado();
            empleado = interfaz.buscarid(id);
        }

        return SUCCESS;
    }

    public String buscarEmpleado() {

        empleado = interfaz.buscarid(id);
        if (empleado == null) {

            addActionError("No se encontro el empleado");
            listar();
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String buscarempleadoxnombre() {
        empleado = interfaz.buscarempleado(nombre);
        if (empleado == null) {
            addActionMessage("<div class=" + "alert alert-danger"
                    + "> No se encontro empleado</div>");
            listar();
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public EmpleadoDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(EmpleadoDAO interfaz) {
        this.interfaz = interfaz;
    }

    public EmpresaDAO getInterfazempresa() {
        return interfazempresa;
    }

    public void setInterfazempresa(EmpresaDAO interfazempresa) {
        this.interfazempresa = interfazempresa;
    }

    public List<Empleado> getLista() {
        return lista;
    }

    public void setLista(List<Empleado> lista) {
        this.lista = lista;
    }

    public List<Empresa> getListaempresa() {
        return listaempresa;
    }

    public void setListaempresa(List<Empresa> listaempresa) {
        this.listaempresa = listaempresa;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
