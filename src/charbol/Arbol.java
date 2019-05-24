/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbol;

/**
 *
 * @author Raul
 */
public class Arbol {
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    /*public void insertarNodo(int d,CreateJson obj){
        if(verificarVacio()){
            raiz = new Nodo(d,obj);
        }else{
            raiz.insertar(d, obj);
        }
    }*/
    
    public void agregarNodo(int d,CreateJson obj){
        Nodo nuevo = new Nodo(d,obj);
        if(raiz==null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo padre;
            while(true){
               padre = aux;
               if(d<aux.dato){
                   aux = aux.izq;
                   if(aux==null){
                       padre.izq = nuevo;
                       return;
                   }
                }else{
                   aux = aux.der;
                   if(aux==null){
                       padre.der = nuevo;
                       return;
                   }
               }
            }
        }
    }
    
    public boolean verificarVacio(){
        return raiz == null;
    }
    
    public void inOrden(Nodo raiz){
        if(raiz!=null){
            inOrden(raiz.getIzq());
            System.out.println(raiz.getDato()+"=>"+raiz.getCjson().getObj());
            inOrden(raiz.getDer());
        }
    }
}
