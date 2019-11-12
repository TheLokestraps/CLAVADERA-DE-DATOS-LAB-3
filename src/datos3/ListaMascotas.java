/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos3;

/**
 *
 * @author jairojg
 */
public class ListaMascotas {
    NodoC ptr;
    NodoC ult;
        
    public ListaMascotas() {
        
    }
    
    NodoM Agregar(NodoM ptr, String Nombre, NodoS Servicios){
        NodoM p =  ptr;
        NodoM q = new NodoM();
        q.nombre = Nombre;
        q.servicios = Servicios;
        if(ptr == null){
            ptr = q;
        }else{
            while(p.link != ptr){
                p = p.link;
            }
            if(p.link.equals(ptr)){
                p.link = q;
                q.link = ptr;
            }
        }
        return ptr;
    }
    
    
    
    
}
class NodoM{
    String nombre;
    NodoS servicios = null;
    NodoM link;


}
