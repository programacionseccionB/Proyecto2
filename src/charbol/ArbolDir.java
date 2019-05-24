/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbol;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class ArbolDir {
    NodoDir raiz;
    ArrayList direcciones = new ArrayList();
    
    public ArbolDir(){
        this.raiz = null;
    }

    public NodoDir getRaiz() {
        return raiz;
    }

    public ArrayList getDirecciones() {
        return direcciones;
    }
    
    public void agregarNodo(int cod, String direc){
        NodoDir nuevo = new NodoDir(cod,direc);
        if(raiz==null){
            raiz = nuevo;
        }else{
            NodoDir aux = raiz;
            NodoDir padre;
            while(true){
               padre = aux;
               if(cod<aux.codigo){
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
     
    public void preOrden(NodoDir raiz){
        if(raiz!=null){
            System.out.println(raiz.getDir());
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
    }
    
    public void buscarDir(NodoDir raiz){
        String dir="";
        if(raiz!=null){
                dir = raiz.getDir();
                direcciones.add(dir);
                buscarDir(raiz.getIzq());
                buscarDir(raiz.getDer());
            
        }
    }
    
}
