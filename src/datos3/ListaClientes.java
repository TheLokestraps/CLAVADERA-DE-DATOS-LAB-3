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
    public static NodoC ptr;
    public static NodoC ult;

    public static void addCola(String Nombre, String Cedula){
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
            
    public static void eliminarCliente(String cedula){
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
    
    public static int costoCedulaMascota(String cedula, String Mascota){
        int costo = 0;
        NodoC p = ptr;
        while(p != null){
            if (p.cedula.equals(cedula)) {
                NodoM q = new NodoM();
                do{
                    if (q.nombre.equals(Mascota)) {
                        for (int i = 0; i < q.CostoT.length; i++) {
                            costo =costo + ListaServicios.conversion(q.CostoT[i]);
                        }
                        return costo;
                    }
                    q = q.link;
                }while(q != p.mascotas);
            }
            p = p.siguiente;
        }
        return costo;
    }
    
    public static NodoM busquedaMascotas(String cedula){
        NodoC p = ptr;
        while(p != null){
            if (p.cedula.equals(cedula)) {
                return p.mascotas;
            }
            p = p.siguiente;
        }
        return null;
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

