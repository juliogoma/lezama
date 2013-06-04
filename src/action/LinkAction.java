/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author JULIOCESAR
 */
public class LinkAction extends ActionSupport {

    public String cargar() {
        return "cargar";
    }
    public String personal() {
        return "personal";
    }
    public String empresa() {
        return "empresa";
    }
    public String empleado() {
        return "empleado";
    }
    
    
    
}
