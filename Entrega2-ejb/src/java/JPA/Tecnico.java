/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author María y Salva
 */
@Entity
public class Tecnico extends Usuario{
     private static final long serialVersionUID = 1L;
   
    
    private String especialidad;
    private String despacho;
    
        //relacion uno a muchos entre Tecnico y Baja
    
    @OneToMany (mappedBy = "baja")
    private List<Baja> baja;
    
    
    @ManyToMany
    @JoinTable(name = "tec_int",
            joinColumns = @JoinColumn(name = "tecnico_fk"),
            inverseJoinColumns = @JoinColumn(name= "intervencion_fk"))
    private List<Intervencion> tecnicoAintervencion;
    
        
    @ManyToOne
    private JefeServicio jefeservicio;
    

    //Relación muchos a muchos entre Tecnico y Reunión
    
    @ManyToMany (mappedBy="tecnicoAreunion")
    private List<Reunion> tecnicoESTAreunion;
    
    
    //Getter y Setter

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDespacho() {
        return despacho;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "especialidad=" + especialidad + '}';
    }



    public JefeServicio getJefeservicio() {
        return jefeservicio;
    }

    public void setJefeservicio(JefeServicio jefeservicio) {
        this.jefeservicio = jefeservicio;
    }

    public List<Reunion> getTecnicoESTAreunion() {
        return tecnicoESTAreunion;
    }

    public void setTecnicoESTAreunion(List<Reunion> tecnicoESTAreunion) {
        this.tecnicoESTAreunion = tecnicoESTAreunion;
    }

    public List<Baja> getBaja() {
        return baja;
    }

    public void setBaja(List<Baja> baja) {
        this.baja = baja;
    }

    public List<Intervencion> getTecnicoAintervencion() {
        return tecnicoAintervencion;
    }

    public void setTecnicoAintervencion(List<Intervencion> tecnicoAintervencion) {
        this.tecnicoAintervencion = tecnicoAintervencion;
    }


     //equal y hascode eredado de Usuario
}
