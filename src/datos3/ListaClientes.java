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
}

class NodoC{
    String nombre;
    String cedula;
    NodoC link;

}