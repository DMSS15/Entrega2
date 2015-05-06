import JPA.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@ManagedBean
@SessionScoped
public class Jefeserviciob implements Serializable{
    


    List<JefeServicio> jefes = new ArrayList <JefeServicio> ();

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
    String correo;
    String password;
    
    public Jefeserviciob(){
        
    }

    public String getEspecialidad(){
        return especialidad;
    }
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

    public int getTelfijo() {
        return telfijo;
    }

    public int getMovil() {
        return movil;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public List<JefeServicio> getJefeServicio() {
        return jefes;
    }

    public void setJefeServicio(List<JefeServicio> jefes) {
        this.jefes = jefes;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
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

    public void setTelfijo(int telfijo) {
        this.telfijo = telfijo;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public void insertar() {
        JefeServicio j = new JefeServicio();
        j.setApellidos(apellidos);
        j.setNombre(nombre);
        j.setDni(DNI);
        j.setNacimiento(nacimiento);
        j.setSexo(sexo);
        j.setNacionalidad(nacionalidad);
        j.setDespacho(despacho);
        j.setDireccion(direccion);
        j.setTfijo(telfijo);
        j.setMovil(nombre);
        j.setPassword(password);
        j.setCorreo(correo);
        j.setEspecialidad(especialidad);
        
        jefes.add(j);
        
        System.out.println(j.getDni());
    }


}
