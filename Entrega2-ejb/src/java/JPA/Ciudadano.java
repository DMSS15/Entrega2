/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Juan Carlos Alcaide
 */
@Entity
public class Ciudadano extends Usuario {

    private static final long serialVersionUID = 1L;

    private String ocupacion;

    //Relacion muchos a muchos ciudadano con administrativo
    @ManyToMany
    @JoinTable(name = "ciu_advo",
            joinColumns = @JoinColumn(name = "administrativo_fk"),
            inverseJoinColumns = @JoinColumn(name = "ciudadano_fk"))
    private List<Administrativo> administativoAciudadano;

    //Relacion uno a muchos entre ciudadano y demandas
    @OneToMany(mappedBy = "ciudadano")
    private List<Demanda> demandas;

    //Relacion de uno a muchos entre ciudadano y citas
    @OneToMany(mappedBy = "ciudadano")
    private List<Cita> citas;

    //relacion muchos a muchos reflexiva entre ciudadanos y ciudadanos
    @ManyToMany
    @JoinTable(name = "familiares",
            joinColumns = @JoinColumn(name = "familiar_fk"),
            inverseJoinColumns = @JoinColumn(name = "familiar2_fk"))
    private List<Ciudadano> familiares;

    //relacion uno a muchos entre ciudadano y expediente
    @OneToMany(mappedBy = "ciudadano")
    private List<Expediente> expedientes;

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public List<Administrativo> getAdministativoAciudadano() {
        return administativoAciudadano;
    }

    public void setAdministativoAciudadano(List<Administrativo> administativoAciudadano) {
        this.administativoAciudadano = administativoAciudadano;
    }

    public List<Demanda> getDemandas() {
        return demandas;
    }

    public void setDemandas(List<Demanda> demandas) {
        this.demandas = demandas;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<Ciudadano> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(List<Ciudadano> familiares) {
        this.familiares = familiares;
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expediente> expedientes) {
        this.expedientes = expedientes;
    }
    
     //equal y hascode heredado de Usuario

}
