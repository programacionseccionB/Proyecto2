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
public class NodoDir {
    int codigo;
    String dir;
    NodoDir izq;
    NodoDir der;
    
    public NodoDir(int cod,String direc){
        this.codigo = cod;
        this.dir = direc;
        this.izq = null;
        this.der = null;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDir() {
        return dir;
    }

    public NodoDir getIzq() {
        return izq;
    }

    public NodoDir getDer() {
        return der;
    }
}
