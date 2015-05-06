/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demandas;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import JPA.*;
import java.io.Serializable;
import javax.inject.Named;
/**
 *
 * @author Maria y Salva
 */
@Named(value = "dem")
@ManagedBean
@SessionScoped
public class Demandab implements Serializable{
    String titulo;
    String descripcion;
    List<Demanda>demandas = new ArrayList<Demanda>();
    public Demandab(String titulo, String descripcion){
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   
    
    public void anadirDemanda (){
        Demanda d = new Demanda ();
        d.setCodigo(1);
        d.setDescripcion(descripcion);
        d.setTitulo(titulo);
        demandas.add(d);
    }
    
}
