
package charbol;

/**
 *
 * @author Raul
 */
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz = null;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }
    
    public void agregarNodo(int d,CreateJsonSaludo obj){
        NodoArbol nuevo = new NodoArbol(d,obj);
        if(raiz==null){
            raiz = nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
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
    
    public void inOrden(NodoArbol raiz){
        if(raiz!=null){
            inOrden(raiz.getIzq());
            System.out.println(raiz.getDato()+"=>"+raiz.getCjsonSaludo().getObj());
            inOrden(raiz.getDer());
        }
    }
}
