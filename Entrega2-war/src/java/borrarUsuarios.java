
import JPA.Ciudadano;
import JPA.Expediente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import JPA.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
@ManagedBean
@SessionScoped
public class borrarUsuarios {
    private List<Usuario> usuarios;
    

    public List<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuarios = usuario;
    }

   

    public borrarUsuarios() {
        usuarios=new ArrayList<Usuario>();
        
        for(int i =0; i<10;i++){
            Usuario us=new Usuario();
            us.setDni("123"+i);
            us.setNombre("Usuario "+i);
            us.setApellidos("Apellidos "+i);
            
            usuarios.add(us);
        }
        
    }
    public void borrar(Usuario usuario){
        usuarios.remove(usuario);
    }
    
    
    
    
    
    
    
    
    
}
