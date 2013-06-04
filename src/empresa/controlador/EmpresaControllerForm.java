/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.controlador;

import com.opensymphony.xwork2.ActionSupport;
import empresa.modelo.Empresa;
import empresa.modelo.dao.EmpresaDAO;
import empresa.modelo.dao.EmpresaDAOImpl;
import java.util.ArrayList;

/**
 *
 * @author JULIOCESAR
 */
public class EmpresaControllerForm extends ActionSupport{
private String razsocial;
private Integer id;
EmpresaDAO interfaz;
private String userId;
private String password;
    ArrayList<Empresa> lista = new ArrayList<Empresa>();
    String msj="";
    Empresa empresa = new Empresa();
    
    public EmpresaControllerForm() {
        interfaz = new EmpresaDAOImpl();
    } 
    
     public String mostrarFormulario() {
    	 if (id != null) {
             empresa = new Empresa();}
        return SUCCESS;
    }
    
    public String listar()
    {
    	lista = interfaz.listar();
    	return SUCCESS;
    }
    
    public String eliminar() {
        empresa = interfaz.eliminar(id);
        id = null;
        msj = "Empresa Eliminado " + empresa.getRazsocial();
        addActionMessage(msj);
        listar();
        return SUCCESS;
    }
    
    public String buscarProto() {
  	  
    	empresa = interfaz.buscarid(id);
     if (empresa == null) {
       
         addActionError("No se encontro el Empresa");
        listar();
         return ERROR;
     } else {
         return SUCCESS;
     }
 }
    public String buscarprotoxnom() {
    	empresa = interfaz.buscarempresa(razsocial);
      if (empresa == null) {
         addActionMessage("No se encontro el Empresa");
         listar();
          return ERROR;
      } else {
          return SUCCESS;
      }
  }

    public String getRazsocial() {
        return razsocial;
    }

    public void setRazsocial(String razsocial) {
        this.razsocial = razsocial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmpresaDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(EmpresaDAO interfaz) {
        this.interfaz = interfaz;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Empresa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empresa> lista) {
        this.lista = lista;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
}
