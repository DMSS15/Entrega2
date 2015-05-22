/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Administrativo;
import JPA.JefeServicio;
import JPA.Tecnico;
import javax.ejb.Local;
/**
 *
 * @author María y Salva
 */
@Local
public interface AdministradorLocal {

        public static enum Error {

        NO_ERROR,
        CUENTA_REPETIDA,
        CUENTA_INEXISTENTE,
        CONTRASENIA_INVALIDA,
        CUENTA_INACTIVA
        };

    public Error registrarJefeServicio(JefeServicio j);
    
    public Error registrarTecnico(Tecnico t);
    
    public Error registrarAdministrativo(Administrativo a);
     
    
    //public Error validarCuenta(String dni, String validacion);

    //public Error compruebaLogin(Administrativo a);

    //public Ciudadano refrescarCiudadano(Ciudadano c);

    public Error modificarJefeServicio(JefeServicio j);
    public Error modificarTecnico(Tecnico t);
    public Error modificarAdministrativo(Administrativo a);
            
    public Error eliminarJefeServicio(JefeServicio j);
    public Error eliminarTecnico(Tecnico t);
    public Error eliminarAdministrativo(Administrativo a);

    //public Error insertar(Contacto c);

    //public Error eliminarContacto(Contacto c);
}
