
import JPA.*;
import java.util.List;
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mv
 */
public class Administrativos {
    
    List <Administrativo> administrativos;
    
    String nombre;
    String DNI;
    String apellidos;
    Date nacimiento;
    String sexo;
    String nacionalidad;
    String despacho;
    String direccion;
    String especialidad;
    int telfijo;
    int movil;
    String password;

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDespacho() {
        return despacho;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getTelfijo() {
        return telfijo;
    }

    public int getMovil() {
        return movil;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelfijo(int telfijo) {
        this.telfijo = telfijo;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
