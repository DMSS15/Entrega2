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
    
    public demandas(){
        
        demanda=new ArrayList<Demanda>();
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
        d.setTitulo("Demanda1");
        d.setDescripcion("kfjaklsdfjlkasjflkads");
        d.setEstado("Activo");
        
        Demanda d2 = new Demanda();
        d2.setCiudadano(c);
        d2.setCodigo(2);
        
        d2.setTitulo("Demanda2");
        d2.setDescripcion("kfjaklsdfjlkasjflkads");
        d2.setEstado("Activo");
        
         Demanda d3 = new Demanda();
        d3.setCiudadano(c1);
        d3.setCodigo(1);
        d3.setTitulo("Demanda1");
        d3.setDescripcion("kfjaklsdfjlkasjflkads");
        d3.setEstado("Activo");
         Demanda d4 = new Demanda();
        d4.setCiudadano(c1);
        d4.setCodigo(1);
        d4.setTitulo("Demanda1");
        d4.setDescripcion("kfjaklsdfjlkasjflkads");
        d4.setEstado("Activo");
         Demanda d5 = new Demanda();
        d5.setCiudadano(c1);
        d5.setCodigo(1);
        d5.setTitulo("Demanda1");
        d5.setDescripcion("kfjaklsdfjlkasjflkads");
        d5.setEstado("Activo");
         Demanda d6 = new Demanda();
        d6.setCiudadano(c1);
        d6.setCodigo(1);
        d6.setTitulo("Demanda1");
        d6.setDescripcion("kfjaklsdfjlkasjflkads");
        d6.setEstado("Activo");
        
        demanda.add(d); demanda.add(d2);demanda.add(d3);demanda.add(d4);demanda.add(d5);demanda.add(d6);
        
        
        tecnico=new ArrayList<Tecnico>();
        Tecnico t = new Tecnico();
        t.setDni("11111111n");
        t.setNombre("Carmen");
        t.setApellidos("Cazorla");
        
        tecnico.add(t);
        Tecnico t1 = new Tecnico();
        t1.setDni("11111111n");
        t1.setNombre("Carmen");
        t1.setApellidos("Cazorla");
        
        tecnico.add(t1);
        Tecnico t2 = new Tecnico();
        t2.setDni("11111111n");
        t2.setNombre("Carmen");
        t2.setApellidos("Cazorla");
        
        tecnico.add(t2);
        Tecnico t3 = new Tecnico();
        t3.setDni("11111111n");
        t3.setNombre("Carmen");
        t3.setApellidos("Cazorla");
        
        tecnico.add(t3);
        Tecnico t4 = new Tecnico();
        t4.setDni("11111111n");
        t4.setNombre("Carmen");
        t4.setApellidos("Cazorla");
        
        tecnico.add(t4);
        Tecnico t5 = new Tecnico();
        t5.setDni("11111111n");
        t5.setNombre("Carmen");
        t5.setApellidos("Cazorla");
        
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

   public void asociar(){
      if(tecselect.getDemanda()==null){
          tecselect.setDemanda(new ArrayList<Demanda>());
      }
       tecselect.getDemanda().add(demdelect);
       demdelect.setTecnico(tecselect);
       demanda.remove(demdelect);
       tecnico.remove(tecselect);
       
   }

}
