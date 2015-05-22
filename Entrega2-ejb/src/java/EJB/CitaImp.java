/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Cita;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author María y Salva
 */
@Stateless
public class CitaImp implements CitaLocal {
    
    private EntityManager em;
    @Override
    public Error insertar(Cita c) {
        Cita cita = em.find(Cita.class, c.getCodigo());
        if (cita != null)
        {
            //  la demanda ya existe
            return Error.CITA_REPETIDA;
        }
        
        em.persist(c);
        
        return Error.NO_ERROR;  
    }

    @Override
    public Error modificar(Cita c) {
         Cita cita = em.find(Cita.class, c.getCodigo());
        if (cita == null)
        {
            //  la demanda ya existe
            return Error.CITA_INEXISTENTE;
        }
        
        em.persist(c);
        
        return Error.NO_ERROR;    
    }

    @Override
    public Error eliminar(Cita c) {
        Cita cita = em.find(Cita.class, c.getCodigo());
        if (cita == null)
        {
            // la demanda ya existe
            return Error.CITA_INEXISTENTE;
        }
        
        em.persist(c);
        
        return Error.NO_ERROR;    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
