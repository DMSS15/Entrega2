package Controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JPA.Ciudadano;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rubencito
 */
@ManagedBean
@SessionScoped
public class verCiudadanos {

    private List<Ciudadano> ciudadanos;

    public List<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(List<Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public verCiudadanos() {
        Ciudadano c = new Ciudadano();
        c.setApellidos("Gutierrez Cazorla");
        c.setDni("75895329k");
        c.setNombre("Ruben");

        Ciudadano c1 = new Ciudadano();
        c1.setApellidos("Gutierrez Cazorla");
        c1.setDni("22222222t");
        c1.setNombre("Noel");

        Ciudadano c2 = new Ciudadano();
        c2.setApellidos("BURGUEÑO CABALLERO");
        c2.setDni("59885507");
        c2.setNombre("MARIA ARACELI");

        Ciudadano c3 = new Ciudadano();
        c3.setApellidos("MARIN PORTILLO");
        c3.setDni("83281911");
        c3.setNombre("ADRIAN");

        Ciudadano c4 = new Ciudadano();
        c4.setApellidos("RUIZ PINTO");
        c4.setDni("77261716");
        c4.setNombre("FELIPE");
        ciudadanos=new ArrayList<Ciudadano>();
        ciudadanos.add(c);
        ciudadanos.add(c1);
        ciudadanos.add(c2);
        ciudadanos.add(c3);
        ciudadanos.add(c4);
    }
}
