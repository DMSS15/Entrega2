/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Expediente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author María y Salva
 */
@Stateless
public class ExpedienteImpl implements ExpedienteLocal{

     private EntityManager em;
     
    public Error crear (Expediente e) {
       Expediente expediente = em.find(Expediente.class, e.getCodigo());
       
       /*GENERAR CODIGO -> MIRAR*/
       
        if (expediente != null)
        {
            //  el expediente ya existe
            return Error.EXPEDIENTE_REPETIDO;
        }
        
        em.persist(e);
        
        return Error.NO_ERROR;  
    }

    @Override
    public Error modificar(Expediente e) {
         Expediente expediente = em.find(Expediente.class, e.getCodigo());
        if (expediente == null)
        {
            //  el expediente ya existe
            return Error.EXPEDIENTE_INEXISTENTE;
        }
        
        em.persist(e);
        
        return Error.NO_ERROR;    
    }

    @Override
    public Error eliminar(Expediente e) {
        Expediente expediente = em.find(Expediente.class,e.getCodigo());
        if (expediente == null)
        {
            // la demanda ya existe
            return Error.EXPEDIENTE_INEXISTENTE;
        }
        
        em.persist(e);
        
        return Error.NO_ERROR;    }
}
