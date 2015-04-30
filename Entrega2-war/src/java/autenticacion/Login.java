/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacion;

import JPA.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author francis
 */
@Named(value = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;
    
    @Inject
    private ControlAutorizacion ctrl;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        usuarios = new ArrayList<Usuario>();
        Usuario admin=new Administrador();
        admin.setCodigo(1);
        admin.setApellidos("Alcaide Gomez");
        admin.setNombre("Juan Carlos");
        admin.setDni("31000518Z");
        admin.setPassword("admin");
        usuarios.add(admin);
        System.out.println("Funciona??");
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        for (Usuario u : usuarios) {
            if (u.getDni().equals(usuario)) {
                if (u.getPassword().equals(contrasenia)) {
                    // Va a una u otra dependiendo del rol
                    ctrl.setUsuario(u);
                    return ctrl.home();
                } else {
                    // Falló la contraseña
                    FacesContext ctx = FacesContext.getCurrentInstance();
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña no válida", "Contraseña no válida"));
                    return null;
                }
            }
        }
        // El usuario no se encuentra
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El usuario no se encuentra", "El usuario no se encuentra"));
        return null;
    }
}
