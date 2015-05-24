package Controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Carlos
 */
import Controladores.ControlAutorizacion;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import JPA.*;
import java.sql.Date;
import javax.enterprise.context.SessionScoped;

@Named
@ManagedBean
@SessionScoped
public class controladorPerfil implements Serializable {

    private Usuario u;

    public Usuario getUsuario() {
        return u;
    }

    public void setUsuario(Usuario u) {
        this.u = u;
    }

    public String getNombre() {

        return u.getNombre();
    }

    public void setNombre(String nombre) {
        u.setNombre(nombre);
    }

    public String getApellidos() {
        return u.getApellidos();
    }

    public String getDni() {
        return u.getDni();
    }

    public void setDni(String dni) {
        this.u.setDni(dni);
    }

    public String getPassword() {
        return u.getPassword();
    }

    public void setPassword(String password) {
        this.u.setPassword(password);
    }

    public String getCentro() {
        return u.getCentro();
    }

    public void setCentro(String centro) {
        this.u.setCentro(centro);
    }

    public String getSexo() {
        return u.getSexo();
    }

    public void setSexo(String sexo) {
        this.u.setSexo(sexo);
    }

    public String getNacionalidad() {
        return u.getNacionalidad();
    }

    public void setNacionalidad(String nacionalidad) {
        this.u.setNacionalidad(nacionalidad);

    }

    public String getDireccion() {
        return u.getDireccion();
    }

    public void setDireccion(String direccion) {
        this.u.setDireccion(direccion);
    }

    public Date getNacimiento() {
        return u.getNacimiento();
    }

    public void setNacimiento(Date nacimiento) {
        this.u.setNacimiento(nacimiento);
    }

    public String getCorreo() {
        return u.getCorreo();
    }

    public void setCorreo(String correo) {
        this.u.setCorreo(correo);
    }

    public String getTelefono() {

        return u.getTelefono();
    }

    public void setTelefono(String telefono) {
        this.u.setTelefono(telefono);
    }

    public void setTelefonoFijo(int telef) {
        this.u.setTfijo(telef);
    }

    public int getTelefonoFijo() {
        return this.u.getTfijo();

    }
    
    public String getEspecialidad(){
        return ((Tecnico) u).getEspecialidad();
    }
     public void setEspecialidad(String esp){
       ((Tecnico) u).setEspecialidad(esp);
    }
    
    public String getDespachoAdmin(){
        return ((Administrador) u).getDespacho();
    }
    public void setDespachoAdmin(String desp){
        ((Administrador) u).setDespacho(desp);
    }
    
     public String getDespachoJS(){
        return ((JefeServicio) u).getDespacho();
    }
    public void setDespachoJS(String desp){
        ((JefeServicio) u).setDespacho(desp);
    }
    
      public String getDespachoAdministrativo(){
        return ((Administrativo) u).getDespacho();
    }
    public void setDespachoAdministrativo(String desp){
        ((Administrativo) u).setDespacho(desp);
    }
    

}
