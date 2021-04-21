/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenerecipher;

import java.awt.Button;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author nhanr
 */
public class VigenereCipher implements ActionListener{

    
        //create static items 
    public static JTextField keyen; 
    public static JLabel key1,key2,keygeneration,keygeneration2;
    public static JButton encryp,decryp;
    public static JTextArea cipher,plain,keyge,keyge2,keyde;
    public static ImageIcon image;
    public static void main(String[] args) {
        
        
        //JFrame = a GUI Windown to add components to
        JFrame frame = new JFrame(); //creates a frame 
        JPanel panel = new JPanel();
        frame.setTitle("Caesar Cipher"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setSize(600,300); //set the dimentsion, width and height of frame
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
        keyge.setBounds(400,40,100,20);
        panel.add(keyge);
        
         keygeneration = new JLabel("keygeneration");
        keygeneration.setBounds(310,40,100,20);
        panel.add(keygeneration);
        
        keyen = new JTextField(4);
        keyen.setBounds(400,10,100,20);
        panel.add(keyen);
        
        encryp = new JButton("Encryption");
        encryp.setBounds(310,70,100,20);
        //ActionListener is notified whenever you click on the button or menu item
        encryp.addActionListener(new VigenereCipher()); 
        panel.add(encryp);
        
        cipher = new JTextArea();
        cipher.setBounds(5,120,300,90);
        panel.add(cipher);
        
        key2 = new JLabel("Key");
        key2.setBounds(310,120,25,20);
        panel.add(key2);
        
        keyge2 = new JTextArea();
        keyge2.setBounds(400,150,100,20);
        panel.add(keyge2);
        
        keyde = new JTextArea();
        keyde.setBounds(400,120,100,20);
        panel.add(keyde);
        
        keygeneration2 = new JLabel("keygeneration");
        keygeneration2.setBounds(310,150,100,20);
        panel.add(keygeneration2);
        
        decryp = new JButton("Decryption");
        decryp.setBounds(310,180,100,20);
        decryp.addActionListener(new VigenereCipher());
        panel.add(decryp);
        
       
        
        
        
        
        
        frame.setVisible(true); //make frame visible
        
        image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\VigenereCipher\\src\\vigenerecipher\\images.png");
        frame.setIconImage(image.getImage());
    }

    static String generateKey(String str, String key)
{
    int x = str.length();
  
    for (int i = 0; ; i++)
    {
        if (x == i)
            i = 0;
        if (key.length() == str.length())
            break;
        key+=(key.charAt(i));
    }
    return key;
}
  
// This function returns the encrypted text
// generated with the help of the key
static String cipherText(String str, String key)
{
    String cipher_text="";
  
    for (int i = 0; i < str.length(); i++)
    {
        // converting in range 0-25
        int x = (str.charAt(i) + key.charAt(i)) %26;
  
        // convert into alphabets(ASCII)
        x += 'A';
  
        cipher_text+=(char)(x);
    }
    return cipher_text;
}
  
// This function decrypts the encrypted text
// and returns the original text
static String originalText(String cipher_text, String key)
{
    String orig_text="";
  
    for (int i = 0 ; i < cipher_text.length() && 
                            i < key.length(); i++)
    {
        // converting in range 0-25
        int x = (cipher_text.charAt(i) - 
                    key.charAt(i) + 26) %26;
  
        // convert into alphabets(ASCII)
        x += 'A';
        orig_text+=(char)(x);
    }
    return orig_text;
}
  
// Driver code

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String plaintext = plain.getText();//get string in textfield
        String keytoencryp = keyen.getText();
        String generated = generateKey(plaintext, keytoencryp);
        //click on Encrypt button
        if(e.getSource()==encryp){
        
        keyge.append(generated);
        String result = cipherText(plaintext,generated);//call Encrypt function
        cipher.append(result);//add result to textfield
        }
        //click on Decrypt button
        else if(e.getSource()==decryp){
        keyde.append(keytoencryp);
        
        keyge2.append(generated);
        String result1 = originalText(plaintext,generated);
        cipher.append(result1);
        
    }
    }
}
    