/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacion;

import JPA.*;
import java.sql.Date;
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
        inicializarUsuarios();
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
    
    
    //-------Metodo para inicializar usuarios
    private void inicializarUsuarios(){
           usuarios = new ArrayList<Usuario>();
        Administrador admin=new Administrador();
        admin.setCodigo(1);
        admin.setApellidos("Alcaide Gomez");
        admin.setNombre("Juan Carlos");
        admin.setDni("31000518Z");
        admin.setPassword("admin");
        admin.setCorreo("algojuca@alu.uma.es");
        admin.setDireccion("Sebastian Garrido 54");
        admin.setNacimiento(new Date(1991, 12, 29));
        admin.setNacionalidad("España");
        admin.setCentro("Centro");
        admin.setSexo("Varon");
        admin.setDespacho("301");
        usuarios.add(admin);
        
         JefeServicio js=new JefeServicio();
        js.setCodigo(2);
        js.setApellidos("Gutierrez Cazorla");
        js.setNombre("Ruben");
        js.setDni("75895329k");
        js.setPassword("admin");
        js.setCorreo("algojuca@alu.uma.es");
        js.setDireccion("Sebastian Garrido 54");
        js.setNacimiento(new Date(1991, 12, 29));
        js.setNacionalidad("España");
        js.setCentro("Centro");
        js.setSexo("Varon");
        js.setDespacho("301");
        
        usuarios.add(js);
        
        
    }
}
