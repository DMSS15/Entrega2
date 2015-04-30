/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Rubencito
 */
public class Intervencion implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private Date fechainicio;
    private Date fechafin;
    private int estado;
    private String descripcion;
    private Date actualizacion;
 
    @ManyToMany (mappedBy="listaRecursos")
    private List<Recurso> listaRecurso;  
    
    @ManyToOne
    private Expediente expediente;
   
    @ManyToMany(mappedBy="listaTecnicos")
    private List<Tecnico> listaTecnicos;

    public List<Recurso> getListaRecurso() {
        return listaRecurso;
    }

 

    public int getCodigo() {
        return codigo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    @Override
    public String toString() {
        return "Intervencion{" + "codigo=" + codigo + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", estado=" + estado + ", descripcion=" + descripcion + ", actualizacion=" + actualizacion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.codigo;
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
        final Intervencion other = (Intervencion) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public int getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getActualizacion() {
        return actualizacion;
    }
    
    

    public void setListaRecurso(List<Recurso> listaRecurso) {
        this.listaRecurso = listaRecurso;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public void setListaTecnicos(List<Tecnico> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
    }

    
    
}
