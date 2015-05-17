/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Administrativo;
import JPA.Ciudadano;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Salva y María
 */

@Stateless
public class AdministrativoImpl implements AdministrativoLocal{
    
    private EntityManager em;

    @Override
    public Error registrarCiudadano(Ciudadano c) {
    // Stub
        Ciudadano ciudadano = em.find(Ciudadano.class, c.getDni());
        if (ciudadano != null)
        {
            // El usuario ya existe
            return Error.CUENTA_REPETIDA;
        }
        
        em.persist(c);
        
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

    @Override
    public Error modificar(Ciudadano c) {
        Ciudadano ciudadano = c;
        
        if (ciudadano == null)
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
        
        em.merge(c);
        return Error.NO_ERROR;
    }
    
    @Override
    public Error eliminar(Ciudadano c){
        Ciudadano ciudadano = c;
        
        if (ciudadano == null)
        {
            return Error.CUENTA_INEXISTENTE;
        }
        
        em.remove(em.merge(c));
        return Error.NO_ERROR;
    }
}
