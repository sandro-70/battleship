/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleship;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ferna
 */
public class tablero {
    public static void main(String[]args){
        juego();
    }
    public static void juego(){
        JButton[][] button=new JButton[8][8];
        JFrame frame=new JFrame("Tablero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        BufferedImage image=null;
        try {
            image = ImageIO.read(tablero.class.getResource("/Images/tablero.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        frame.pack();
        
        
        
    }
}
