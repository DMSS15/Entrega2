/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Demanda;
import javax.ejb.Local;


/**
 *
 * @author María y Salva
 */
@Local
public interface DemandaLocal {

    public static enum Error {

        NO_ERROR,
        DEMANDA_REPETIDA,
        DEMANDA_INEXISTENTE
        //CONTRASENIA_INVALIDA
        };

    public Error insertar (Demanda d);     
    
    //public Error validarCuenta(String dni, String validacion);

    //public Error compruebaLogin(Administrativo a);

    //public Ciudadano refrescarCiudadano(Ciudadano c);

    public Error modificar(Demanda d);
            
    public Error eliminar (Demanda d);

    //public Error insertar(Contacto c);

    //public Error eliminarContacto(Contacto c);
}