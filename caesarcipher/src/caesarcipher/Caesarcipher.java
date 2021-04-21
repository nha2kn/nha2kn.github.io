
package caesarcipher;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Caesarcipher implements ActionListener{
    //create static items 
    public static JTextField keyen,keyde; 
    public static JLabel key1,key2;
    public static JButton encryp,decryp;
    public static JTextArea cipher,plain;
    public static ImageIcon image;
    
    public static void main(String[] args) {
        
        
        //JFrame = a GUI Windown to add components to
        JFrame frame = new JFrame(); //creates a frame 
        JPanel panel = new JPanel();
        frame.setTitle("Caesar Cipher"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setSize(500,250); //set the dimentsion, width and height of frame
        frame.add(panel);//add panel to frame
        panel.setLayout(null);//sort container
        
        
        
        
        //new operator and add to frame
        plain = new JTextArea();
        plain.setBounds(5,10,300,55);
        panel.add(plain);
        
        key1 = new JLabel("Key");
        key1.setBounds(310,10,25,20);
        panel.add(key1);
        
        keyen = new JTextField(4);
        keyen.setBounds(340,10,71,20);
        panel.add(keyen);
        
        encryp = new JButton("Encryption");
        encryp.setBounds(310,44,100,20);
        //ActionListener is notified whenever you click on the button or menu item
        encryp.addActionListener(new Caesarcipher()); 
        panel.add(encryp);
        
        cipher = new JTextArea();
        cipher.setBounds(5,90,300,55);
        panel.add(cipher);
        
        key2 = new JLabel("Key");
        key2.setBounds(310,90,25,20);
        panel.add(key2);
        
        keyde = new JTextField(4);
        keyde.setBounds(340,90,71,20);
        panel.add(keyde);
        
        decryp = new JButton("Decryption");
        decryp.setBounds(310,123,100,20);
        decryp.addActionListener(new Caesarcipher());
        panel.add(decryp);
        
        frame.setVisible(true); //make frame visible
        image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\caesarcipher\\src\\caesarcipher\\download.png");
        frame.setIconImage(image.getImage());
        
    }
    
//Encrypt Function
public static String encrypt(String cipher, int shift) 
{ 
        if(shift>26)
                {
                        shift=shift%26;
                }
        else if(shift<0)
        {
                shift=(shift%26)+26;
        }
        String ciphertext ="";
        int lenght=cipher.length();
        for (int i = 0; i < lenght; i++) 
        {
                char ch = cipher.charAt(i);
                if(Character.isLetter(ch))
                {
                        if(Character.isLowerCase(ch))
                        {
                            char c = (char)(ch+shift);
                                if(c>'z')
                                {
                                    ciphertext +=(char)(ch-(26-shift));
                                }
                                else
                                {
                                    ciphertext +=c;
                                }
                        }
                        else if(Character.isUpperCase(ch))
                        {
                            char c = (char)(ch+shift);
                                if(c>'Z'){
                                    ciphertext+=(char)(ch-(26-shift));
                                }           
                                else{
                                        ciphertext+=c;
                                }
                        }      
                }
                else
                {
                    ciphertext+=ch;
                }
        }
        return ciphertext; 
    } 
//Decrypt Function
public static String decrypt(String cipher, int shift) {
        if(shift>26){
            shift=shift%26;
        }
        else if(shift<0)
        {
            shift=(shift%26)+26;
        }
        String ciphertext ="";
        int lenght=cipher.length();
        for (int i = 0; i < lenght; i++) 
        {
                char ch = cipher.charAt(i);
                if(Character.isLetter(ch))
                {
                        if(Character.isLowerCase(ch))
                        {
                            char c = (char)(ch-shift);
                                if(c<'a')
                                {
                                    ciphertext +=(char)(ch+(26-shift));
                                }
                                else
                                {
                                    ciphertext +=c;
                                }
                        }
                        else if(Character.isUpperCase(ch))
                        {
                            char c = (char)(ch-shift);
                                if(c<'A')
                                {
                                    ciphertext+=(char)(ch + (26-shift));
                                }           
                                else
                                {
                                        ciphertext+=c;
                                }
                        }
                }
                else{
                    ciphertext+=ch;
                }
        }
        return ciphertext;
}
    @Override
    //set even when click button
    public void actionPerformed(ActionEvent e) {
        
        String plaintext = plain.getText();//get string in textfield
        
        //click on Encrypt button
        if(e.getSource()==encryp){
        String keytoencryp = keyen.getText();
        int keytoencryp1 = Integer.parseInt(keytoencryp);//parse string to integer
        String result = encrypt(plaintext, keytoencryp1);//call Encrypt function
        cipher.append(result);//add result to textfield
        }
        //click on Decrypt button
        else if(e.getSource()==decryp){
        String keytodecryp = keyde.getText();
        int keytodecryp1 = Integer.parseInt(keytodecryp);
        String result1 = decrypt(plaintext,keytodecryp1);
        cipher.append(result1);
        } 
    }
}
