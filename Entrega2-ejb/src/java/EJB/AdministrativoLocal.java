/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Ciudadano;
import JPA.Administrativo;
import javax.ejb.Local;

/**
 *
 * @author Salva
 */
@Local
public interface AdministrativoLocal {

    public static enum Error {

        NO_ERROR,
        CUENTA_REPETIDA,
        CUENTA_INEXISTENTE,
        CONTRASENIA_INVALIDA,
        CUENTA_INACTIVA
    };

    public Error registrarCiudadano(Ciudadano c);
    
    //public Error validarCuenta(String dni, String validacion);

    //public Error compruebaLogin(Administrativo a);

    //public Ciudadano refrescarCiudadano(Ciudadano c);

    public Error modificar(Ciudadano c);
    
    public Error eliminar(Ciudadano c);

    //public Error insertar(Contacto c);

    //public Error eliminarContacto(Contacto c);
}
