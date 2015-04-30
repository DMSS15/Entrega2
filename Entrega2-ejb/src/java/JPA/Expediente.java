/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Rubencito
 */

@Entity
public class Expediente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String estado;
    private Date fechainicio;
    private String descripcion;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Expediente other = (Expediente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expediente{" + "codigo=" + codigo + ", estado=" + estado + ", fechainicio=" + fechainicio + ", descripcion=" + descripcion + '}';
    }
    
     //------Relaciones------
    //Relacion 1 a muchos entre ciudadano y expedientes
    @ManyToOne
    private Ciudadano ciudadano;
    
     //Relacion de uno a muchos entre expediente e intervencion
    @OneToMany (mappedBy = "expediente")
    private List<Intervencion> intervencion;

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public List<Intervencion> getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(List<Intervencion> intervencion) {
        this.intervencion = intervencion;
    }
    
    
}
