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
public class EmpresaController extends ActionSupport {

    Empresa empresa = new Empresa();
    EmpresaDAO interfaz;
    ArrayList<Empresa> lista = new ArrayList<Empresa>();
    String msj = "";
    private Integer id;

    public EmpresaController() {
        interfaz = new EmpresaDAOImpl();
    }

    public String guardar() throws Exception {
        boolean ban;

        ban = interfaz.guardar(empresa);
        if (ban = true) {
            msj = "Empresa Guardado";
        } else {
            msj = "Empresa Modificado";
        }
        return SUCCESS;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public EmpresaDAO getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(EmpresaDAO interfaz) {
        this.interfaz = interfaz;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
