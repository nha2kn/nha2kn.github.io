
package JFrame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frames {


    public static void main(String[] args) {
        //Jframe = a GUI windown to add component to
        /*
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("Jframe title goes here"); //set title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible
        
        //create an ImageIcon
        ImageIcon image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\JavaGUI\\src\\icon.png");
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of backgound
        */
        
        MyFrame myFrame = new MyFrame();
    }
    
}
