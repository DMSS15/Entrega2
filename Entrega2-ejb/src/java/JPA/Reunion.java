/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 *
 * @author Diego Fernández Godoy 
 */
@Entity
public class Reunion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigoReunion;
    private Date fecha;
    private String tema;
    private String descripcion;
    private Time horaInicio;
    private Time horaFin;
        
    //getters y setters
    
    public Integer getCodigoReunion() {
        return codigoReunion;
    }

    public void setCodigoReunion(Integer codigoReunion) {
        this.codigoReunion = codigoReunion;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoReunion != null ? codigoReunion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Reunion)) {
            return false;
        }
        Reunion other = (Reunion) object;
        if ((this.codigoReunion == null && other.codigoReunion != null) || (this.codigoReunion != null && !this.codigoReunion.equals(other.codigoReunion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Reunion[ id=" + codigoReunion + " ]";
    }
    //Relación muchos a muchos Reunión con Tecnicos
    @ManyToMany
    @JoinTable(name = "reu_tec",
            joinColumns = @JoinColumn(name = "tecnico_fk"),
            inverseJoinColumns = @JoinColumn(name= "reunion_fk"))
    private List<Tecnico> tecnicoESTAreunion;

    public List<Tecnico> getTecnicoESTAreunion() {
        return tecnicoESTAreunion;
    }

    public void setTecnicoESTAreunion(List<Tecnico> tecnicoESTAreunion) {
        this.tecnicoESTAreunion = tecnicoESTAreunion;
    }
    
    
    
}
