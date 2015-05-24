/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JPA.Ciudadano;
import JPA.Demanda;
import JPA.Tecnico;
import com.sun.javafx.scene.control.skin.VirtualFlow;
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
public class demandas {

    private List<Demanda> demanda;
    private Demanda demdelect;
    private List<Tecnico> tecnico;
    private Tecnico tecselect;

    public demandas() {

        demanda = new ArrayList<Demanda>();
        Ciudadano c = new Ciudadano();
        c.setApellidos("Gutierrez Cazorla");
        c.setDni("75895329k");
        c.setNombre("Ruben");

        Ciudadano c1 = new Ciudadano();
        c1.setApellidos("Gutierrez Cazorla");
        c1.setDni("22222222t");
        c1.setNombre("Noel");

        Demanda d = new Demanda();
        d.setCiudadano(c1);
        d.setCodigo(1);
        d.setTitulo("Hijo");
        d.setDescripcion("Pega a sus padres");
        d.setEstado("Activo");

        Demanda d2 = new Demanda();
        d2.setCiudadano(c);
        d2.setCodigo(2);

        d2.setTitulo("Alcoholico");
        d2.setDescripcion("No trae dinero a casa");
        d2.setEstado("Activo");

        Demanda d3 = new Demanda();
        d3.setCiudadano(c1);
        d3.setCodigo(3);
        d3.setTitulo("Crisis");
        d3.setDescripcion("Familia no tiene sueldo");
        d3.setEstado("Activo");
        Demanda d4 = new Demanda();
        d4.setCiudadano(c1);
        d4.setCodigo(4);
        d4.setTitulo("Crisis");
        d4.setDescripcion("La madre es soltera");
        d4.setEstado("Activo");
        Demanda d5 = new Demanda();
        d5.setCiudadano(c1);
        d5.setCodigo(5);
        d5.setTitulo("Economia");
        d5.setDescripcion("Poco poco");
        d5.setEstado("Activo");
        Demanda d6 = new Demanda();
        d6.setCiudadano(c1);
        d6.setCodigo(6);
        d6.setTitulo("Problema hijos");
        d6.setDescripcion("Hijos necesitan un psicologo");
        d6.setEstado("Activo");

        demanda.add(d);
        demanda.add(d2);
        demanda.add(d3);
        demanda.add(d4);
        demanda.add(d5);
        demanda.add(d6);

        tecnico = new ArrayList<Tecnico>();
        Tecnico t = new Tecnico();

        t.setDni("11111111n");
        t.setNombre("Carmen");
        t.setApellidos("Cazorla");
        t.setEstoyDeBaja(true);
        tecnico.add(t);
        Tecnico t1 = new Tecnico();
        t1.setDni("11111112n");
        t1.setNombre("Peepo");
        t1.setApellidos("Cazorla");
        t1.setEstoyDeBaja(true);
        tecnico.add(t1);
        Tecnico t2 = new Tecnico();
        t2.setDni("11111113n");
        t2.setNombre("Pepa");
        t2.setApellidos("Cazorla");
        t2.setEstoyDeBaja(true);
        tecnico.add(t2);
        Tecnico t3 = new Tecnico();
        t3.setDni("11111114n");
        t3.setNombre("Pipa");
        t3.setApellidos("Cazorla");
        t3.setEstoyDeBaja(true);
        tecnico.add(t3);
        Tecnico t4 = new Tecnico();
        t4.setDni("11111115n");
        t4.setNombre("Paca");
        t4.setApellidos("Cazorla");
        t4.setEstoyDeBaja(true);
        tecnico.add(t4);
        Tecnico t5 = new Tecnico();
        t5.setDni("11111116n");
        t5.setNombre("Luisa");
        t5.setApellidos("Cazorla");
        t5.setEstoyDeBaja(false);
        tecnico.add(t5);
    }

    public List<Demanda> getDemanda() {
        return demanda;
    }

    public void setDemanda(List<Demanda> demanda) {
        this.demanda = demanda;
    }

    public Demanda getDemdelect() {
        return demdelect;
    }

    public void setDemdelect(Demanda demdelect) {
        this.demdelect = demdelect;
    }

    public List<Tecnico> getTecnico() {
        return tecnico;
    }

    public void setTecnico(List<Tecnico> tecnico) {
        this.tecnico = tecnico;
    }

    public Tecnico getTecselect() {
        return tecselect;
    }

    public void setTecselect(Tecnico tecselect) {
        this.tecselect = tecselect;
    }

    public void asociar() {

        if (tecselect != null && demdelect != null) {
            tecnico.remove(tecselect);
            if (tecselect.getDemanda() == null) {
                tecselect.setDemanda(new ArrayList<Demanda>());
            }
            tecselect.getDemanda().add(demdelect);
            demdelect.setTecnico(tecselect);

            tecnico.add(tecselect);
            demanda.remove(demdelect);
            //tecnico.remove(tecselect);
            tecselect=null;
            demdelect=null;
        }
    }

    public int numDemandas(Tecnico tec) {
        if (tec.getDemanda() == null) {
            return 0;
        }
        return tec.getDemanda().size();
    }

    public void denegar(Demanda dem) {
        demanda.remove(dem);
    }
}
