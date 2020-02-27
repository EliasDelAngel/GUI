/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eliasangel
 */
public class Formulario_GUI_Btton extends JFrame implements ActionListener{
    JButton boton1;
    
   public Formulario_GUI_Btton(){
       setLayout(null);
       boton1 = new JButton("CERRAR");
       boton1.setBounds(280, 230, 100, 30);
       add(boton1);
       boton1.addActionListener(this);
       
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == boton1){
           System.exit(0);
           
       }
       
   }
    public static void main(String[] args) {
        Formulario_GUI_Btton formulario = new Formulario_GUI_Btton();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setResizable(false);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
  
}
