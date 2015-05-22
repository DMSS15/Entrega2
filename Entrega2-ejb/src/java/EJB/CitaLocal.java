/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Cita;
import javax.ejb.Local;

/**
 *
 * @author María y Salva
 */
@Local
public interface CitaLocal {

    public static enum Error {

        NO_ERROR,
        CITA_REPETIDA,
        CITA_INEXISTENTE
    };

    public Error insertar(Cita c);

    //public Error validarCuenta(String dni, String validacion);
    //public Error compruebaLogin(Administrativo a);
    //public Ciudadano refrescarCiudadano(Ciudadano c);
    public Error modificar(Cita c);

    public Error eliminar(Cita c);

    //public Error insertar(Contacto c);
    //public Error eliminarContacto(Contacto c);
}
