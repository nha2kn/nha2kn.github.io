/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

import JFrame.MyFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.text.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author nhanr
 */
public class button implements ActionListener{
    public static JButton button;
    public static JLabel label;
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\JavaGUI\\src\\button\\icon.png");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\nhanr\\OneDrive\\Máy tính\\New folder\\JavaGUI\\src\\button\\icon.png");
        
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(new button());
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.BOTTOM);
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
        frame.add(label);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            label.setVisible(true);
    }
}
}
