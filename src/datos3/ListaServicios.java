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
public class ListaServicios {
    NodoS ptr = null;
    NodoS ult = null;

    public ListaServicios() {
    }
    
    public void agregar(int costo, String descripcion){
        NodoS nuevo = new NodoS(costo,descripcion);
        if (ptr == null) {
            ptr = nuevo;
            ult = nuevo;
        }else{
            ult.link = nuevo;
            ult = nuevo;
        
        }
    }
    
    
}
class NodoS{
    int costo;
    String descripcion;
    NodoS link = null;

    public NodoS(int costo, String descripcion) {
        this.costo = costo;
        this.descripcion = descripcion;
    }

    
}