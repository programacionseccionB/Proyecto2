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
public class ReadJson {
    JSONParser parser;
    String answer = "";
    
    public ReadJson(){
        parser = new JSONParser();
    }
    
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
    }
}
