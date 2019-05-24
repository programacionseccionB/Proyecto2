
package charbol;

import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author Raul
 */
public class CharBol {
    public static ArbolBinario arbolito = new ArbolBinario();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra1="";
        String palabra2="";
        String palabra3="";
        
        
        //Se van instanciando los json files
        CreateJsonSaludo objSeguros = new CreateJsonSaludo();
        CreateJsonSaludo objSaludos = new CreateJsonSaludo();
        CreateJsonSaludo objTipos = new CreateJsonSaludo();
        
        //Objeto que lee la respuesta dependiendo de la palabra clave y de acuerdo al json
        ReadJsonSaludo respuesta = new ReadJsonSaludo();
        
        //Se van llenando los json files con palabras claves y su posible respuesta
        objSeguros.setObj("Medico", "500 mensuales");
        objSeguros.FlushFile("MySegurosJson.json");
        objSeguros.setObj("Vida", "700 mensuales");
        objSeguros.FlushFile("MySegurosJson.json");
        objSaludos.setObj("hello", "Que tal buen dia como estas");
        objSaludos.FlushFile("MySaluteJson.json");
        objSaludos.setObj("hola buen dia", "Que tal buen dia, Bienvenido al servicio de"
                + " Seguros Grupo7");
        objSaludos.FlushFile("MySaluteJson.json");
        objTipos.setObj("1", "Auto");
        objTipos.FlushFile("MyTipos.json");
        
        
        //Se van ingresando en los Nodos los diferentes json files
        arbolito.agregarNodo(3, objSeguros);
        arbolito.agregarNodo(4, objSaludos);
        arbolito.agregarNodo(2, objTipos);
        //Se imprimen los json completos que estan en cada nodo InOrden
        recorridoInOrden();
        
        //Se consigue la respuesta con la palabra clave dependiendo del json
        /*palabra1 = respuesta.getRedParser("MySegurosJson.json","Medico");
        System.out.println("Precio seguro de vida: "+palabra1);*/
        palabra1 = respuesta.getRedParser("MySegurosJson.json","Vida");
        System.out.println("Precio seguro de vida: "+palabra1);
        /*palabra2 = respuesta.getRedParser("MySaluteJson.json","hello");
        System.out.println("Mi primer saludo es: "+palabra2);*/
        palabra2 = respuesta.getRedParser("MySaluteJson.json","hola buen dia");
        System.out.println("Mi primer saludo es: "+palabra2);
        palabra3 = respuesta.getRedParser("MyTipos.json","1");
        System.out.println("El principal tipo de seguro es: "+palabra3);
    }
    
     public static void recorridoInOrden(){
        if(!arbolito.verificarVacio()){
            arbolito.inOrden(arbolito.getRaiz());
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacío");
        }
    }
    
}
