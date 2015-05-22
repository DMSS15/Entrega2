/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Recurso;
import javax.ejb.Local;


/**
 *
 * @author María y Salva
 */
@Local
public interface RecursoLocal {

    public static enum Error {

        NO_ERROR,
        RECURSO_REPETIDO,
        RECURSO_INEXISTENTE
    };

    public Error insertar(Recurso r);

    //public Error validarCuenta(String dni, String validacion);
    //public Error compruebaLogin(Administrativo a);
    //public Ciudadano refrescarCiudadano(Ciudadano c);
    public Error modificar(Recurso r);

    public Error eliminar(Recurso r);

    //public Error insertar(Contacto c);
    //public Error eliminarContacto(Contacto c);
}
