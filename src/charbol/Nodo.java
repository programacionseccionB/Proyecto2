/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Raul
 */
public class Nodo {
    int dato;
    CreateJson cJson;
    Nodo izq;
    Nodo der;
    
    public Nodo(int d,CreateJson obj){
        this.dato = d;
        this.cJson = obj;
        this.izq = null;
        this.der = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }

    public CreateJson getCjson() {
        return cJson;
    }
    
    /*public void insertar(int d, CreateJson obj){
        if(d<this.dato){
            if(this.izq==null){
                this.izq = new Nodo(d,obj);
            }else{
                this.izq.insertar(d, obj);
            }
        }else if(d>this.dato){
            if(this.der==null){
                this.der = new Nodo(d,obj);
            }else{
                this.der.insertar(d, obj);
            }
        }
    }*/
}
