/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.sql.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author María y Salva
 */

@Entity
public class JefeServicio extends Usuario{
     private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String despacho;
    private String especialidad;
    

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.despacho);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JefeServicio other = (JefeServicio) obj;
        if (!Objects.equals(this.despacho, other.despacho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JefeServicio{" + "despacho=" + despacho + '}';
    }
    
    //Relación de Uno a Mucho
    
    @OneToMany (mappedBy="Tecnico")
    private List<Tecnico> tecnicos;
    
}
