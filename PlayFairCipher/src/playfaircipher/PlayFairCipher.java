/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfaircipher;

import java.awt.Button;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
/**
 *
 * @author nhanr
 */


public class PlayFairCipher implements ActionListener{
    
        //create static items 
    public static JTextField keyen; 
    public static JLabel key1,key2;
    public static JButton encryp,decryp;
    public static JTextArea cipher,plain,keyge,keyge2,keyde;
    public static ImageIcon image;
    
    
    
    
    public static void main(String[] args) {
        
        
        //JFrame = a GUI Windown to add components to
        JFrame frame = new JFrame(); //creates a frame 
        JPanel panel = new JPanel();
        frame.setTitle("Caesar Cipher"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setSize(600,350); //set the dimentsion, width and height of frame
        frame.add(panel);//add panel to frame
        panel.setLayout(null);//sort container
        
        
        
        //new operator and add to frame
        plain = new JTextArea();
        plain.setBounds(5,10,300,90);
        panel.add(plain);
        
        key1 = new JLabel("Key");
        key1.setBounds(310,10,25,20);
        panel.add(key1);
        
        keyge = new JTextArea();
        keyge.setBounds(430,40,130,95);
        panel.add(keyge);
        
         
        keyen = new JTextField(4);
        keyen.setBounds(400,10,100,20);
        panel.add(keyen);
        
        encryp = new JButton("Encryption");
        encryp.setBounds(310,70,100,20);
        //ActionListener is notified whenever you click on the button or menu item
        encryp.addActionListener(new PlayFairCipher()); 
        panel.add(encryp);
        
        cipher = new JTextArea();
        cipher.setBounds(5,120,300,90);
        panel.add(cipher);
        
        key2 = new JLabel("Key");
        key2.setBounds(310,140,25,20);
        panel.add(key2);
        
        keyge2 = new JTextArea();
        keyge2.setBounds(430,170,130,95);
        panel.add(keyge2);
        
        keyde = new JTextArea();
        keyde.setBounds(400,140,100,20);
        panel.add(keyde);
        
        
        
        decryp = new JButton("Decryption");
        decryp.setBounds(310,180,100,20);
        decryp.addActionListener(new PlayFairCipher());
        panel.add(decryp);
        
       
        // convert all the characters to lowercase
        
  
    // function to remove duplicate characters from the key
        
        frame.setVisible(true); //make frame visible
        
        image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\PlayFairCipher\\src\\playfaircipher\\1.png");
        frame.setIconImage(image.getImage());
    }

  
// Driver code

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String plaintext = plain.getText();//get string in textfield
        String keytoencryp = keyen.getText();
        
        PLayfair pfc1 = new PLayfair(keytoencryp, plaintext);
        pfc1.cleanPlayFairKey();
        String re = pfc1.generateCipherKey();
        
        //click on Encrypt button
        if(e.getSource()==encryp){
        keyde.append(keytoencryp);
        keyge.append(re);
        String result = pfc1.encryptMessage();//call Encrypt function
        cipher.append(result);//add result to textfield
        }
        //click on Decrypt button
        else if(e.getSource()==decryp){
        
        
        keyge2.append(re);
        String result1 = pfc1.Decript();
        cipher.append(result1);
        
    }
    }
}