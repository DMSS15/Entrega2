/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import JPA.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


@Named(value = "login")
@ManagedBean
@SessionScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;
    
    @Inject
    private ControlAutorizacion ctrl;
    @Inject
    private controladorPerfil perf;

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
                    
                        perf.setUsuario(u);
                    
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
        
        
        Ciudadano c =new Ciudadano();
        c.setCodigo(3);
        c.setApellidos("Moreno");
        c.setNombre("Maria");
        c.setDni("123");
        c.setPassword("123");
        c.setCorreo("magonmo92@alu.uma.es");
        c.setDireccion("Sebastian Garrido 54");
        c.setNacimiento(new Date(1992, 01, 12));
        c.setCentro("Teatinos");
        c.setNacionalidad("España");
        c.setSexo("Mujer");
        c.setTelefono("999");
        usuarios.add(c);
        
        //--Administrativos--
         Administrativo a =new Administrativo();
        a.setCodigo(4);
        a.setApellidos("Fernández");
        a.setNombre("Salva");
        a.setDni("1234");
        a.setPassword("1234");
        a.setCorreo("safcf@alu.uma.es");
        a.setDireccion("Sebastian Garrido 54");
        a.setNacimiento(new Date(1991, 9, 29));
        a.setNacionalidad("España");
        a.setSexo("Hombre");
        a.setCentro("Centro");
        usuarios.add(a);
        
         Tecnico tec=new Tecnico();
        tec.setCodigo(5);
        tec.setApellidos("Alcaide Gomez");
        tec.setNombre("Juan Carlos");
        tec.setDni("tecnico");
        tec.setPassword("tecnico");
        tec.setCorreo("algojuca@alu.uma.es");
        tec.setDireccion("Sebastian Garrido 54");
        tec.setNacimiento(new Date(1991, 12, 29));
        tec.setNacionalidad("España");
        tec.setCentro("Centro");
        tec.setSexo("Varon");
        tec.setDespacho("301");
        tec.setTelefono("664671040");
        tec.setEspecialidad("Maltrato");
        tec.setTfijo(957375546);
        
        usuarios.add(tec);
        
    }
}
