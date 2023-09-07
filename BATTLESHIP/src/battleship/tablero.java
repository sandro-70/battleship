/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


    public class tablero extends JPanel {
    private JButton[][] botones;
    private String type;
    private int size;
    public boolean Acorazado=false,Destructor=false,Portaaviones=false,Submarino=false;

    public tablero() {
        setLayout(new GridLayout(8, 8));
        botones = new JButton[8][8];

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                botones[fila][columna] = new JButton();
                botones[fila][columna].setPreferredSize(new Dimension(50, 50));
                final int row= fila;
                final int col=columna;
                botones[fila][columna].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton sourceButton = (JButton) e.getSource();
                        if(Acorazado){
                            setSize(4);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.red);
       }
                        Acorazado=false;}
                        
                        else if(Destructor){
                            setSize(2);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.yellow);
       }
                        Destructor=false;}
                     else if(Portaaviones){
                            setSize(5);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.black);
       }
                        Portaaviones=false;}
                     else if(Submarino){
                            setSize(3);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.ORANGE);
       }
                        Submarino=false;}}
                    
                });
                
                botones[fila][columna].addMouseListener(new MouseAdapter(){
                    @Override
                    
                    public void mouseEntered(MouseEvent e){
                        JButton sourceButton = (JButton) e.getSource();
                        if(Acorazado){
                            setSize(4);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.green);}}
                        else if(Destructor){
                            setSize(2);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.green);}
                        }
                        else if(Portaaviones){
                            setSize(5);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.green);}
                        }
                        else if(Submarino){
                            setSize(3);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground(Color.green);}
                        }
                    }
                    
                    @Override
            public void mouseExited(MouseEvent e) {
                // Restaurar el color de fondo cuando el mouse sale del botón
                JButton sourceButton = (JButton) e.getSource();
                
                
                
                    if(Acorazado){
                            setSize(4);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground((UIManager.getColor("Button.background")));}}
                    else if(Destructor){
                            setSize(2);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground((UIManager.getColor("Button.background")));}}
                    else if(Portaaviones){
                            setSize(5);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground((UIManager.getColor("Button.background")));}}
                    else if(Submarino){
                            setSize(3);
                           for(int i=col;i<col+size;i++){
                            botones[row][i].setBackground((UIManager.getColor("Button.background")));}}
                if(sourceButton.getBackground()==Color.RED){
                sourceButton.setBackground(Color.RED);}
                else if(sourceButton.getBackground()==Color.yellow){
                sourceButton.setBackground(Color.yellow);}
                
                
                
                
                
                
            }
                });

                add(botones[fila][columna]); 
        }
    }
    }
    public void setType(String type){
        this.type=type;
        if(type.equals("Acorazado")){
                Acorazado=true;}
        else if(type.equals("Portaaviones"))
                Portaaviones=true;
        else if(type.equals("Destructor"))
                Destructor=true;
        else if(type.equals("Submarino"))
                Submarino=true;
    }
    
   public void setSize(int size){
       this.size=size;
       }
   }
    


