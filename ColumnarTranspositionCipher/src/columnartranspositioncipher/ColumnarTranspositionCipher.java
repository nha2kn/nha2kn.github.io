
package ColumnarTranspositionCipher;

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


public class ColumnarTranspositionCipher implements ActionListener{
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
        frame.setTitle("Colummar Transposition Cipher"); //set title of frame
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
        encryp.addActionListener(new ColumnarTranspositionCipher()); 
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
        decryp.addActionListener(new ColumnarTranspositionCipher());
        panel.add(decryp);
        
        frame.setVisible(true); //make frame visible
        image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\ColumnarTranspositionCipher\\src\\download.png");
        frame.setIconImage(image.getImage());
    }
    
public static String encryptCT(String key, String text) {
        int[] arrange = arrangeKey(key);

        int lenkey = arrange.length;
        int lentext = text.length();

        int row = (int) Math.ceil((double) lentext / lenkey);

        char[][] grid = new char[row][lenkey];
        int z = 0;
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < lenkey; y++) {
                if (lentext == z) {
                    // at random alpha for trailing null grid
                    grid[x][y] = RandomAlpha();
                    z--;
                } else {
                    grid[x][y] = text.charAt(z);
                }

                z++;
            }
        }
        String enc = "";
        for (int x = 0; x < lenkey; x++) {
            for (int y = 0; y < lenkey; y++) {
                if (x == arrange[y]) {
                    for (int a = 0; a < row; a++) {
                        enc = enc + grid[a][y];
                    }
                }
            }
        }
        return enc;
    }

    public static String decryptCT(String key, String text) {
        int[] arrange = arrangeKey(key);
        int lenkey = arrange.length;
        int lentext = text.length();

        int row = (int) Math.ceil((double) lentext / lenkey);

        String regex = "(?<=\\G.{" + row + "})";
        String[] get = text.split(regex);

        char[][] grid = new char[row][lenkey];

        for (int x = 0; x < lenkey; x++) {
            for (int y = 0; y < lenkey; y++) {
                if (arrange[x] == y) {
                    for (int z = 0; z < row; z++) {
                        grid[z][y] = get[arrange[y]].charAt(z);
                    }
                }
            }
        }

        String dec = "";
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < lenkey; y++) {
                dec = dec + grid[x][y];
            }
        }

        return dec;
    }

    public static char RandomAlpha() {
        //generate random alpha for null space
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }

    public static int[] arrangeKey(String key) {
        //arrange position of grid
        String[] keys = key.split("");
        Arrays.sort(keys);
        int[] num = new int[key.length()];
        for (int x = 0; x < keys.length; x++) {
            for (int y = 0; y < key.length(); y++) {
                if (keys[x].equals(key.charAt(y) + "")) {
                    num[y] = x;
                    break;
                }
            }
        }

        return num;
    }
    @Override
    //set even when click button
    public void actionPerformed(ActionEvent e) {
        
        String plaintext = plain.getText();//get string in textfield
        
        //click on Encrypt button
        if(e.getSource()==encryp){
        String keytoencryp = keyen.getText();
        
        String result = encryptCT(keytoencryp,plaintext);//call Encrypt function
        cipher.append(result);//add result to textfield
        }
        //click on Decrypt button
        else if(e.getSource()==decryp){
        String keytodecryp = keyde.getText();
        
        String result1 = decryptCT(keytodecryp,plaintext);
        cipher.append(result1);
        } 
    }
}
