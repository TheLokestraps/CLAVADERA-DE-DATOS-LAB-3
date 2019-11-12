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
    
    
    
    public void agregar(int costo){
        NodoS nuevo = new NodoS(costo);
        if (ptr == null) {
            ptr = nuevo;
            ult = nuevo;
        }else{
            ult.link = nuevo;
            ult = nuevo;
        
        }
    }
    
    public static int conversion(int tipo){
        switch(tipo){
            case 1: 
                return 50000;
            case 2:
                return 35000;
            case 3:
                return 25000;
            case 4:
                return 40000;
            default:
                return -1;
        }
    
    }
    
    
}
class NodoS{
    int costo;
    NodoS link = null;

    public NodoS(int costo) {
        this.costo = costo;
    }

}