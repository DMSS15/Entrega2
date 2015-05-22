/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Administrativo;
import JPA.Ciudadano;
import JPA.JefeServicio;
import JPA.Tecnico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author María y Salva
 */
@Stateless
public class AdministradorImp implements AdministradorLocal{

   private EntityManager em;

    public Error registrarJefeServicio(JefeServicio j) {
    // Stub
        JefeServicio jefe= em.find(JefeServicio.class, j.getDni());
        if (jefe != null)
        {
            // El usuario ya existe
            return Error.CUENTA_REPETIDA;
        }
        
        em.persist(j);
        
        return Error.NO_ERROR;    
    }
    
      public Error registrarTecnico(Tecnico t) {
    // Stub
       Tecnico tecnico = em.find(Tecnico.class, t.getDni());
        if (tecnico != null)
        {
            // El usuario ya existe
            return Error.CUENTA_REPETIDA;
        }
        
        em.persist(t);
        
        return Error.NO_ERROR;    
    }
      
      public Error registrarAdministrativo(Administrativo a) {
    // Stub
        Administrativo administrativo = em.find(Administrativo.class, a.getDni());
        if (administrativo != null)
        {
            // El usuario ya existe
            return Error.CUENTA_REPETIDA;
        }
        
        em.persist(a);
        
        return Error.NO_ERROR;    
    }

    /*
    @Override
    public Ciudadano refrescarCiudadano(Ciudadano c) {
        Error e = compruebaLogin (c);
        if (e != Error.NO_ERROR)
        {
            return null;
        }
        
        // else
        Ciudadano ciudadano = em.find(Ciudadano.class, c.getDni());
        em.refresh(ciudadano);
        return ciudadano;
    }
    */

    public Error modificarAdministrativo (Administrativo a) {
        Administrativo administrativo = a;
        
        if (administrativo == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        //Error e = compruebaLogin(ciudadano);
        /*
        if (e != Error.NO_ERROR)
        {
            return e;
        }
                */
        
        em.merge(a);
        return Error.NO_ERROR;
    }
    
     public Error modificarTecnico (Tecnico t) {
        Tecnico tecnico = t;
        
        if (tecnico == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        //Error e = compruebaLogin(ciudadano);
        /*
        if (e != Error.NO_ERROR)
        {
            return e;
        }
                */
        
        em.merge(t);
        return Error.NO_ERROR;
    }
    
      public Error modificarJefeServicio (JefeServicio j) {
        JefeServicio jefe = j;
        
        if (jefe == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        //Error e = compruebaLogin(ciudadano);
        /*
        if (e != Error.NO_ERROR)
        {
            return e;
        }
                */
        
        em.merge(j);
        return Error.NO_ERROR;
    }
      
    public Error eliminarTecnico(Tecnico t){
        Tecnico tecnico = t;
        
        if (tecnico == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        em.remove(em.merge(t));
        return Error.NO_ERROR;
    }

     public Error eliminarAdministrativo (Administrativo a){
        Administrativo admi = a;
        
        if (admi == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        em.remove(em.merge(a));
        return Error.NO_ERROR;
    }
     
      public Error eliminarJefeServicio(JefeServicio j){
        JefeServicio jefe = j;
        
        if (jefe == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        em.remove(em.merge(j));
        return Error.NO_ERROR;
    }

 

   
    
}
