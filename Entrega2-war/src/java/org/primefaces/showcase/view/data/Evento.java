/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.showcase.view.data;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.ScheduleEvent;

/**
 *
 * @author Rubencito
 */
 
public class Evento extends DefaultScheduleEvent {
    
    
    private String tipo;
 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Evento (){
        super();
    }
     public Evento(String tipo,String title, Date start, Date end){
         super(title,start,end);
         this.tipo= tipo;
         
     }
      public Evento(String tipo,String title, Date start, Date end, boolean allDay) {
          super(title,start,end,allDay);
         this.tipo= tipo;
    }

    public Evento(String tipo,String title, Date start, Date end, String styleClass) {
        super(title,start,end,styleClass);
         this.tipo= tipo;
    }

    public Evento(String tipo,String title, Date start, Date end, Object data) {
        super(title,start,end,data);
         this.tipo= tipo;
    }
    
    
}
