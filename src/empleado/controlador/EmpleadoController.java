/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado.controlador;

import com.opensymphony.xwork2.ActionSupport;
import empleado.modelo.Empleado;
import empleado.modelo.dao.EmpleadoDAO;
import empleado.modelo.dao.EmpleadoDAOImpl;
import java.util.ArrayList;

/**
 *
 * @author JULIOCESAR
 */
public class EmpleadoController extends ActionSupport{
  Empleado empleado = new Empleado();
    EmpleadoDAO interfaz;
    ArrayList<Empleado> lista = new ArrayList<Empleado>();
    String msj = "";
    private Integer id;  
    
    public EmpleadoController() {
        interfaz = new EmpleadoDAOImpl();
    }
    public String guardar() throws Exception {
		boolean ban;
		ban = interfaz.guardar(empleado);
		// interfaz.EnviarEmail(usuario);
		if (ban == true) {
			msj = "Empleado Guardaro";
		} else {
			msj = "Empleado Modificado";
		}
		return SUCCESS;
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

    public ArrayList<Empleado> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleado> lista) {
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
