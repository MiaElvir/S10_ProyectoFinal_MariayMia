/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s10_proyectofinal_mia.belen;

import java.util.ArrayList;


public class Administrador {
    ArrayList<Flores> flores;// manda atraer una clase, Flores, en Flores solo hay getters and setters

    public Administrador() {
    }
   
public void listas (){// constructor vacio
 flores=new ArrayList();

}
public void producto (Flores producto){//producto es lo que trae
    flores.add(producto);// al ArrayList flores se le añade el producto que trae parametro "producto"
    
}
public String imprimir (){
    String reporte=" ";
    for (int i = 0; i < flores.size(); i++) {//recorre la lista
        reporte+=flores.get(i).toString()+"\n" ;//metodo que trae mis atributos
    }
    
    return reporte;

}
public boolean eliminar (String codigo){
    boolean existe=false;
    for (int i = 0; i < flores.size(); i++) {
        if (flores.get(i).getCodigo().equals(codigo)){
            existe=true;
            flores.remove(i);
        }
        
    }
    return existe;

}
public boolean modificar (Flores  produ){
    boolean existe=false;
    for (int i = 0; i < flores.size(); i++) {
        if (flores.get(i).getCodigo().equals(produ.getCodigo())  ){
            
                existe=true;
                flores.get(i).setNombre(produ.getNombre());
       
            
        }
        
    }
    return existe;

}
public boolean modificarcant (Flores prod){
    boolean existe=false;
    for (int i = 0; i < flores.size(); i++) {
        if (flores.get(i).getCodigo().equals(prod.getCodigo())  ){
            
                existe=true;
                flores.get(i).setCant(prod.getCant());
       
            
        }
        
    }
    return existe;


}
public boolean modificarId (Flores prod){
    boolean existe=false;
    for (int i = 0; i < flores.size(); i++) {
        if (flores.get(i).getNombre().equals(prod.getNombre())  ){
                existe=true;
                flores.get(i).setCodigo(prod.getCodigo());
       
            
        }
        
    }
    return existe;


}
}




    

