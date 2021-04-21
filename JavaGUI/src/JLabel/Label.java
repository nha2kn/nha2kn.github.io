
package JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Label {
    public static void main(String[] args) {
            
        //Jlabel = a GUI display area for a string of text, an image , or both
        
        ImageIcon image = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\JavaGUI\\src\\JLabel\\images.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        
        
        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text left,center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text left,center, bottom of imageicon
        label.setForeground(new Color(0x00FF00)); //set front color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(-25); //set gap of text image
        label.setBackground(Color.BLACK); //set backgound color
        label.setOpaque(true);//display backgound color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of text+icon within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of text+icon within label
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
