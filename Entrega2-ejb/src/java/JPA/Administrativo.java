/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author María y Salva
 */

@Entity

public class Administrativo extends Usuario {
      private static final long serialVersionUID = 1L;
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String despacho;

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.despacho);
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
        final Administrativo other = (Administrativo) obj;
        if (!Objects.equals(this.despacho, other.despacho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "despacho=" + despacho + '}';
    }
    
    @ManyToMany (mappedBy="administativoAciudadano")
    private List<Ciudadano> administrativoPORciudadano;
  }
