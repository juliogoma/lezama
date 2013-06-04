package personal.controlador;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import personal.modelo.Personal;
import personal.modelo.dao.PersonalDAO;
import personal.modelo.dao.PersonalDAOImpl;

public class PersonalController extends ActionSupport {
Personal personal = new Personal();
PersonalDAO interfaz;
ArrayList<Personal> lista = new ArrayList<Personal>();
String msj="";
private Integer id;

public PersonalController()
{
    interfaz = new PersonalDAOImpl();
}
public String guardar()throws Exception
{
	boolean ban;
	
	ban=interfaz.guardar(personal);
	if(ban=true)
	{
		msj="Personal Guardado";
	}
	else
	{
		msj="Personal Modificado";
	}
	return SUCCESS;
	}
 
    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public PersonalDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PersonalDAO interfaz) {
        this.interfaz = interfaz;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
