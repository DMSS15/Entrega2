/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacion;

import JPA.Usuario;
import JPA.Administrador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Juan Carlos
 */
@Named(value = "controlAutorizacion")
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

    private boolean isAdministrador() {
        return this.usuario instanceof Administrador;
    }
/*
    private boolean isAdministrativo() {
        return this.usuario instanceof Administrativo;
    }

    private boolean isTecnico() {
        return this.usuario instanceof Tecnico;
    }

    private boolean isCiudadano() {
        return this.usuario instanceof Ciudadano;
    }
*/
}
