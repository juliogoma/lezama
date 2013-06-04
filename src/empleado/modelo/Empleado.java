/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado.modelo;

import empresa.modelo.Empresa;
import persona.modelo.Persona;

/**
 *
 * @author JULIOCESAR
 */
public class Empleado extends Persona{
 private Empresa empresa;
 private String puesto;

    public Empleado() {
    }

    public Empleado(Empresa empresa, String puesto, Integer id, String dni, String nombre, String apePaterno, String apeMaterno, String sexo, String estadoCivil, String fechaNac, String lugarNac, String telefono, String correo, String celular) {
        super(id, dni, nombre, apePaterno, apeMaterno, sexo, estadoCivil, fechaNac, lugarNac, telefono, correo, celular);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
 
}
