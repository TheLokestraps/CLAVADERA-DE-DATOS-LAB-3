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
        
    
    static NodoM Agregar(NodoM ptr, String Nombre, String[] Servicios,int CostoT){
        NodoM p =  ptr;
        NodoM q = new NodoM();
        q.nombre = Nombre;
        q.CostoT = Servicios;
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
    String[] CostoT;
    NodoM link;


}
