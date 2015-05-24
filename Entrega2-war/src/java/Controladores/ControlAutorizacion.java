/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import JPA.*;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Juan Carlos
 */
@Named(value = "controlAutorizacion")
@ManagedBean
@SessionScoped
public class ControlAutorizacion implements Serializable {

    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String home() {
        // Devuelve la página Home dependiendo del rol del usuario
        if (usuario == null) {
            return "login.xhtml";
        }
        // else
        if (isAdministrador()) {
            return "administrador.xhtml";
        }

        if (isAdministrativo()) {
            return "administrativo.xhtml";
        }

        if (isCiudadano()) {
            return "ciudadano.xhtml";
        }
        if (isTecnico()) {
            return "tecnico.xhtml";
        }
        if(isJefeServicio()){
            return "jefeServicio.xhtml";
        }

        return null;
    }

    public String logout() {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        return "login.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlAutorizacion() {
    }

    public boolean isAdministrador() {
        return this.usuario instanceof Administrador;
    }

    public boolean isAdministrativo() {
        return this.usuario instanceof Administrativo;
    }

    public boolean isTecnico() {
        return this.usuario instanceof Tecnico;
    }

    public boolean isCiudadano() {
        return this.usuario instanceof Ciudadano;
    }
    public boolean isJefeServicio(){
        return this.usuario instanceof JefeServicio;
    }
    
    public boolean isTrabajador(){
        return (isAdministrador() || isAdministrativo() || isTecnico() || isJefeServicio());
    }
            
    
}
