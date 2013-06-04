package personal.controlador;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import personal.modelo.Personal;
import personal.modelo.dao.PersonalDAO;
import personal.modelo.dao.PersonalDAOImpl;

public class PersonalControllerForm extends ActionSupport {
private String nombre;
private Integer id;
PersonalDAO interfaz;
private String userId;
private String password;
    ArrayList<Personal> lista = new ArrayList<Personal>();
    String msj="";
    Personal personal = new Personal();
    
    public PersonalControllerForm() {
        interfaz = new PersonalDAOImpl();
    }

    public String execute() throws Exception {

        if ("admin".equals(userId) && "admin".equals(password)) {

            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String mostrarFormulario() {
    	 if (id != null) {
             personal = new Personal();}
        return SUCCESS;
    }
    
    public String listar()
    {
    	lista = interfaz.listar();
    	return SUCCESS;
    }
    
    public String eliminar() {
        personal = interfaz.eliminar(id);
        id = null;
        msj = "Personal Eliminado " + personal.getNombre();
        addActionMessage(msj);
        listar();
        return SUCCESS;
    }
    
    public String buscarProto() {
  	  
    	personal = interfaz.buscarid(id);
     if (personal == null) {
       
         addActionError("No se encontro el personal");
        listar();
         return ERROR;
     } else {
         return SUCCESS;
     }
 }
    public String buscarprotoxnom() {
    	personal = interfaz.buscarpersonal(nombre);
      if (personal == null) {
         addActionMessage("No se encontro el personal");
         listar();
          return ERROR;
      } else {
          return SUCCESS;
      }
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonalDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PersonalDAO interfaz) {
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

    public ArrayList<Personal> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Personal> lista) {
        this.lista = lista;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

}
