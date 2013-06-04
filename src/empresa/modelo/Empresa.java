/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo;

/**
 *
 * @author JULIOCESAR
 */
public class Empresa {
    private Integer id;
    private String razsocial;
    private String ruc;
    private String gerencia;
    private String divison;
    private String area;
    private String ubicacion;

    public Empresa() {
    }

    public Empresa(Integer id, String razsocial, String ruc, String gerencia, String divison, String area, String ubicacion) {
        this.id = id;
        this.razsocial = razsocial;
        this.ruc = ruc;
        this.gerencia = gerencia;
        this.divison = divison;
        this.area = area;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazsocial() {
        return razsocial;
    }

    public void setRazsocial(String razsocial) {
        this.razsocial = razsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
