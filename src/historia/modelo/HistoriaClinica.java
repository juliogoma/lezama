/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package historia.modelo;

import java.sql.Blob;
import java.util.Date;
import evaluacionmedica.modelo.EvaluacionMedica;

/**
 *
 * @author JULIOCESAR
 */
public class HistoriaClinica {
    private Integer id;
    private Date FechRegistro;
    private Date FechModificacion;
    private String estado;
    private byte[] firma;
    private EvaluacionMedica evMedica;
}
