/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos3;

import javax.swing.JOptionPane;

/**
 *
 * @author jairojg
 */
public class ListaClientes {
    static NodoC ptr;
    static NodoC ult;

    public void addCola(String Nombre, String Cedula){
        NodoC p =  ptr;
        NodoC q = new NodoC();
        q.nombre = Nombre;
        q.cedula = Cedula;
        if(ptr == null){
            ptr = q;
        }else{
            while(p.siguiente != null){
                p = p.siguiente;
            }
            p.siguiente = q;
            ult = q;
        }
    }
            
    public void eliminarCliente(String cedula){
        if (ptr == null) {
            JOptionPane.showMessageDialog(null, "La lista de clientes esta vacia.");
        }else{
            NodoC antp = new NodoC();
            antp.siguiente = ptr;
            NodoC p = ptr;
            while(p != null){
                if (p.cedula.equals(cedula)) {
                    antp.siguiente = p.siguiente;
                    JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
                    break;
                }
                antp = p;
                p = p.siguiente;
            }
        }
    
    }
    
    
}
class NodoC{
    String nombre;
    String cedula;
    NodoC siguiente = null;
    NodoM mascotas = null;

    public NodoC(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public NodoC() {
    }
    
    
}

