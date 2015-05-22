/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Demanda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author María y Salva
 */
@Stateless
public class DemandaImp implements DemandaLocal{
    
    private EntityManager em;
    @Override
    public Error insertar(Demanda d) {
        Demanda demanda = em.find(Demanda.class, d.getCodigo());
        if (demanda != null)
        {
            //  la demanda ya existe
            return Error.DEMANDA_REPETIDA;
        }
        
        em.persist(d);
        
        return Error.NO_ERROR;  
    }

    @Override
    public Error modificar(Demanda d) {
         Demanda demanda = em.find(Demanda.class, d.getCodigo());
        if (demanda == null)
        {
            //  la demanda ya existe
            return Error.DEMANDA_INEXISTENTE;
        }
        
        em.persist(d);
        
        return Error.NO_ERROR;    
    }

    @Override
    public Error eliminar(Demanda d) {
        Demanda demanda = em.find(Demanda.class, d.getCodigo());
        if (demanda == null)
        {
            // la demanda ya existe
            return Error.DEMANDA_INEXISTENTE;
        }
        
        em.persist(d);
        
        return Error.NO_ERROR;    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
