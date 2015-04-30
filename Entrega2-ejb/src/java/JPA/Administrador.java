/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Administrador extends Usuario {

    private static final long serialVersionUID = 1L;

    private String despacho;

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }



    @Override
    public String toString() {
        return "Administrador{" + "despacho=" + despacho + '}';
    }

    //equal y hascode eredado de Usuario
}
