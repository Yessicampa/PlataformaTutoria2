/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Yessicampa
 */
public class Metodos {
//el puntero al primer elemento
    private Nodo root;
    //el total de nodos en la lista
    private int numNodos;

    //el constructor inicializa las variables
    public Metodos(){
        root = null;
        numNodos = 0;
    }

    public void adicionar(Nodo newNodo) {
                //puntero temporal para recorreme en la lista
        Nodo tmp = root;

        //si la lista esta vacia
        if(tmp==null){
            //lo agregamos al root
            root = newNodo;
        }else{
            //de lo contrario nos recorremos hasta el ultimo
            while(tmp.ptr!=null)
                tmp = tmp.ptr;
                                
            //en el ultimo hacemos el enlace 
            tmp.ptr = newNodo;
        }
        //incrementamos el numero de nodos
        numNodos++;

    }
    
//imprime la lista de nodos
    public String listar(){
        //puntero que se movera sobre la lista
        Nodo tmp = root;
        String cadena="Codigo     Nº habitantes     Extensión T";
        //sercirandonos que no este vacia
        if(tmp==null){
        	   JOptionPane.showMessageDialog(new JDialog(), "Lista Vacia");
        }else{
            //nos movemos hasta el final imprimiendo nodo por nodo
            int i=0;
            String mapto = "";
            while (tmp != null){
            	cadena = cadena +"\n"+" "+tmp.codigo+"       "+tmp.nHabitantes+"       " +tmp.extensionT;
           		cadena = cadena +mapto;
        		tmp = tmp.ptr;
                i++;
            }
        }
        return (cadena);
    }    

    public void promedio(){
                Nodo tmp = root;

        int i=0;
            int cHabitantes=0;
            cHabitantes=i+i;
            int promedio=tmp.nHabitantes/cHabitantes;
            JOptionPane.showMessageDialog(null, promedio);
    }

   
}
 