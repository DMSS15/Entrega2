/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Juan Carlos Alcaide
 */
@Entity
public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String hora;
    private Integer duracion;
    private String centro;
    private String municipio;
    
    //Faltan relaciones centro y municipio

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCentro() {
        return centro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    
    //relaciones
    
    @ManyToOne
    private Ciudadano ciudadano;
    

}
