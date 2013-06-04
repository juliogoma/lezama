package personal.modelo;

import java.util.Date;

import persona.modelo.Persona;

public class Personal extends Persona{
private String codColegio;
private String cargo;
private String estado;
private String fechContrato;
private String usuario;
private String password;

public Personal(){}

    public Personal(String codColegio, String cargo, String estado, String fechContrato, String usuario, String password, Integer id, String dni, String nombre, String apePaterno, String apeMaterno, String sexo, String estadoCivil, String fechaNac, String lugarNac, String telefono, String correo, String celular) {
        super(id, dni, nombre, apePaterno, apeMaterno, sexo, estadoCivil, fechaNac, lugarNac, telefono, correo, celular);
        this.codColegio = codColegio;
        this.cargo = cargo;
        this.estado = estado;
        this.fechContrato = fechContrato;
        this.usuario = usuario;
        this.password = password;
    }

    public String getCodColegio() {
        return codColegio;
    }

    public void setCodColegio(String codColegio) {
        this.codColegio = codColegio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(String fechContrato) {
        this.fechContrato = fechContrato;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
