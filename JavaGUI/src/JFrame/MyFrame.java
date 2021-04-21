/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author nhanr
 */
public class MyFrame extends JFrame{
    
    MyFrame(){
    
    this.setTitle("Jthis title goes here"); //set title of the this
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
    this.setResizable(false); //prevent this from being resized
    this.setSize(420,420); //sets the x-dimension, and y-dimension of this
    this.setVisible(true); //make this visible

    //create an ImageIcon
    ImageIcon image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\JavaGUI\\src\\JFrame\\icon.png");
    this.setIconImage(image.getImage()); //change icon of this
    this.getContentPane().setBackground(new Color(123,50,250)); //change color of backgound
}
}
