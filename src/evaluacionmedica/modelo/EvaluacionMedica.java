/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionmedica.modelo;

/**
 *
 * @author JULIOCESAR
 */
public class EvaluacionMedica {
private Integer id;
private String anteOcupacionales;
private String antePersonales;
private String anteFamiliares;
private String habitos;
private String numHijos;
private String estadofamilares;
private String antePatologicos;
private String diagnostico;
private String recomendaciones;

    public EvaluacionMedica() {
    }

    public EvaluacionMedica(Integer id, String anteOcupacionales, String antePersonales, String anteFamiliares, String habitos, String numHijos, String estadofamilares, String antePatologicos, String diagnostico, String recomendaciones) {
        this.id = id;
        this.anteOcupacionales = anteOcupacionales;
        this.antePersonales = antePersonales;
        this.anteFamiliares = anteFamiliares;
        this.habitos = habitos;
        this.numHijos = numHijos;
        this.estadofamilares = estadofamilares;
        this.antePatologicos = antePatologicos;
        this.diagnostico = diagnostico;
        this.recomendaciones = recomendaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnteOcupacionales() {
        return anteOcupacionales;
    }

    public void setAnteOcupacionales(String anteOcupacionales) {
        this.anteOcupacionales = anteOcupacionales;
    }

    public String getAntePersonales() {
        return antePersonales;
    }

    public void setAntePersonales(String antePersonales) {
        this.antePersonales = antePersonales;
    }

    public String getAnteFamiliares() {
        return anteFamiliares;
    }

    public void setAnteFamiliares(String anteFamiliares) {
        this.anteFamiliares = anteFamiliares;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(String numHijos) {
        this.numHijos = numHijos;
    }

    public String getEstadofamilares() {
        return estadofamilares;
    }

    public void setEstadofamilares(String estadofamilares) {
        this.estadofamilares = estadofamilares;
    }

    public String getAntePatologicos() {
        return antePatologicos;
    }

    public void setAntePatologicos(String antePatologicos) {
        this.antePatologicos = antePatologicos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }



}
