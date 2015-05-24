/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import JPA.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;


@ManagedBean
@SessionScoped
public class Demandab implements Serializable{

   private String dni;
   private String titulo;
   private String descripcion;
   private List<Demanda> demandas=new ArrayList<Demanda>();

    public Demandab(){
        
    }
    
    
    public void insertar (String titulo, String descripcion) {
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
    
    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
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

    public void anadirDemanda() {
        Demanda d = new Demanda();
        Ciudadano c = new Ciudadano();
        c.setDni(dni);
        //d.setCodigo(1);
        d.setDescripcion(descripcion);
        d.setTitulo(titulo);
        d.setCiudadano(c);
        demandas.add(d);
        System.out.println(d.getTitulo());
    }
}
