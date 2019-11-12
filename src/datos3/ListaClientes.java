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
public class ListaClientes {
    static NodoC ptr;
    static NodoC ult;

    NodoC addCola(NodoC ptr, String Nombre, String Cedula){
        NodoC p =  ptr;
        NodoC q = new NodoC();
        q.nombre = Nombre;
        q.cedula = Cedula;
        if(ptr == null){
            ptr = q;
        }else{
            while(p.link != null){
                p = p.link;
            }
            p.link = q;
        }
        return ptr;
    }
    
    
    
    
}
class NodoC{
    String nombre;
    String cedula;
    NodoC link;

}

