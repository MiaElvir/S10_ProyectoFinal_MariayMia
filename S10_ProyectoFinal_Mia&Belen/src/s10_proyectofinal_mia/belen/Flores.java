/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s10_proyectofinal_mia.belen;

import java.util.ArrayList;


public class Flores {
    String codigo,nombre,cant;

 
    public String toString() {
        return  " [ " + " Id = " + codigo + ", nombre = " + nombre + ", stock = " + cant + ']' ;
    }
    

    public Flores(String codigo, String nombre, String cant) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cant = cant;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }
   
    

    
}
