/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author Yessicampa
 */
public class Nodo {
    public Nodo ptr;
    // puedes poner todos los datos que quieras
    public String codigo;
    public int nHabitantes;
    public int extensionT;    
    
    //constructor por default es NULL, porque sera el ultimo de la lista
    public Nodo(){
        
        ptr = null;
    }
} 