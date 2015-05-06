
import JPA.Ciudadano;
import JPA.Expediente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
public class gestionnarExpedientes {
    private List<Expediente> expedientes;
    private Expediente exp;
    private String id;
    private String descripcion, estado;
    private List<Ciudadano> ciudadanos;
    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public gestionnarExpedientes() {
        Ciudadano c=new Ciudadano();
        c.setNombre("Juanka");
        c.setApellidos("Alcaide Gómez");
        expedientes=new ArrayList<Expediente>();
        ciudadanos=new ArrayList<Ciudadano>();
        for(int i=0; i<10; i++){
            exp=new Expediente();
            exp.setCodigo(i);
            exp.setDescripcion("Descricion "+i);
            exp.setEstado("Activo");
            exp.setFechainicio(new Date( 2015, i, i));
            exp.setCiudadano(c);
           expedientes.add(exp);
        }
        
        
    }
    public void eliminarExp(Expediente e){
            expedientes.remove(e);
        }
    public void aniadirExp(){
        Ciudadano c=new Ciudadano();
        c.setNombre("Pepe");
        c.setApellidos("Fernandez");
        Expediente e= new Expediente();
        e.setCodigo(Integer.parseInt(id));
        e.setDescripcion(descripcion);
        e.setEstado(estado);
        e.setFechainicio(new Date());
        e.setCiudadano(c);
        
        expedientes.add(e);
    }
    
    
    
    
    
}
