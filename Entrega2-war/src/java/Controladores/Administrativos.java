package Controladores;


import JPA.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mv
 */
@ManagedBean
@SessionScoped
public class Administrativos implements Serializable{

    List<Administrativo> ladministrativos = new ArrayList <Administrativo> ();

    String nombre;
    String DNI;
    String apellidos;
    Date nacimiento;
    String sexo;
    String nacionalidad;
    String despacho;
    String direccion;
    int telfijo;
    int movil;
    String correo;
    String password;
    
    public Administrativos(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDespacho() {
        return despacho;
    }

    public String getDireccion() {
        return direccion;
    }


    public int getTelfijo() {
        return telfijo;
    }

    public int getMovil() {
        return movil;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public List<Administrativo> getAdministrativos() {
        return ladministrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.ladministrativos = administrativos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    public void setTelfijo(int telfijo) {
        this.telfijo = telfijo;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insertar() {
        Administrativo ad = new Administrativo();
        ad.setApellidos(apellidos);
        ad.setNombre(nombre);
        ad.setDni(DNI);
        ad.setNacimiento(nacimiento);
        ad.setSexo(sexo);
        ad.setNacionalidad(nacionalidad);
        ad.setDespacho(despacho);
        ad.setDireccion(direccion);
        ad.setTfijo(telfijo);
        ad.setMovil(nombre);
        ad.setPassword(password);
        ad.setCorreo(correo);
        
        ladministrativos.add(ad);
        
        System.out.println(ad.getDni());
    }
}
