
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
public class NodoArbol {
    int dato;
    CreateJsonSaludo cjsonSaludo;
    NodoArbol izq;
    NodoArbol der;
    
    public NodoArbol(int d,CreateJsonSaludo obj){
        this.dato = d;
        this.cjsonSaludo = obj;
        this.izq = null;
        this.der = null;
    }

    public int getDato() {
        return dato;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public CreateJsonSaludo getCjsonSaludo() {
        return cjsonSaludo;
    }
}    
