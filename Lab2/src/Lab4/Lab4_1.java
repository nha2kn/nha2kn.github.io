/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nhanr
 */
public class Lab4_1 {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           
           try (BufferedWriter br = new BufferedWriter(new FileWriter("data1.txt"))){
               System.out.println("Nhap noi dung file: ");
               String content = input.nextLine();
               br.write(content);
               System.out.println("Done!");
           }catch (IOException ex){
               Logger.getLogger(Lab4_1.class.getName()).log(Level.SEVERE,null,ex);
           }
    }
}
