/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Raul
 */
public class CreateJsonSaludo {
    JSONObject obj;
    
    public CreateJsonSaludo(){
        obj = new JSONObject();
    }

    public void setObj(String key,String value) {
        this.obj.put(key,value);
    }
    
    public void FlushFile(String dir){
        try(FileWriter file = new FileWriter(dir))
        {
            file.write(this.obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        } 
    }

    public JSONObject getObj() {
        return obj;
    }
    
    //Este método esta bajo prueba la idea es conseguir el contenido del json con palabra clave
    /*
    JSONParser parser = new JSONParser();
    String answer = "";
    
    public String getRedParser(String dir,String entry){
        try
        {
        Object obj = parser.parse(new FileReader(dir));
        JSONObject jsonObject = (JSONObject)obj;
        answer = (String) jsonObject.get(entry);
        }
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
        return answer;
    }*/
}
