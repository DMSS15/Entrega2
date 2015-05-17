/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import JPA.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Ciudadanob implements Serializable{
    
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fecnac;
    private String sexo;
    private String nacionalidad;
    private String direccion;
    private String ocupacion;
    private String email;
    private int fijo;
    private String movil;
    private String pass;
    private String passn;
    
    private List<Ciudadano> ciudadanos=new ArrayList<Ciudadano>();
    
    public Ciudadanob(){
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public int getFijo() {
        return fijo;
    }

    public void setFijo(int fijo) {
        this.fijo = fijo;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassn() {
        return passn;
    }

    public void setPassn(String passn) {
        this.passn = passn;
    }

    public List<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(List<Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }
    
    
    
    public void anadirCiudadano() {
//        Ciudadano c = new Ciudadano();
//        
//        c.setDni(dni);
//        c.setNombre(nombre);
//        c.setApellidos(apellidos);
//        c.setNacimiento(fecnac);
//        c.setSexo(sexo);
//        c.setNacionalidad(nacionalidad);
//        c.setDireccion(direccion);
//        c.setOcupacion(ocupacion);
//        c.setCorreo(email);
//        c.setTfijo(fijo);
//        c.setMovil(movil);
//        c.setPassword(pass);
//        
//        ciudadanos.add(c);
//        
//        System.out.println(c.getApellidos());
//        
        
    }
    
    
}
