/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Expediente;
import javax.ejb.Local;

/**
 *
 * @author María y Salva
 */
@Local
public interface ExpedienteLocal {

     public static enum Error {

        NO_ERROR,
        EXPEDIENTE_REPETIDO,
        EXPEDIENTE_INEXISTENTE
    };

    public Error crear (Expediente e);

    //public Error validarCuenta(String dni, String validacion);
    //public Error compruebaLogin(Administrativo a);
    //public Ciudadano refrescarCiudadano(Ciudadano c);
    public Error modificar(Expediente e);

    public Error eliminar(Expediente e);
}
