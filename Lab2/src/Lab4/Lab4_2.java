/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ResourceBundle;
import java.util.*;

/**
 *
 * @author nhanr
 */
public class Lab4_2 {
    public static void main(String[] args) {
        
        Properties prop1 = new Properties();
        InputStream input = new FileInputStream("config.properties");
        //load a properties file
        prop1.load(input);
        //get the property value and print it out
        prop1.getProperty("database");
        prop1.getProperty("khoa");
        prop1.getProperty("chuc vu");
        input.close();
        
        ResourceBundle bundle = ResourceBundle.getBundle("prop1");
        bundle.keySet();
        for(String key:bundle.keySet()){
            System.out.println("ket = "+key+", value = "+bundle.getString(key));
        }
    }
    
    
}
