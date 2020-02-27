/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;
import javax.swing.*;
/**
 *
 * @author eliasangel
 */
public class Formulario_GUI extends JFrame{
    
    public Formulario_GUI(){
        setLayout(null);
     
    }
    public static void main(String[] args) {
        Formulario_GUI formulario1 = new Formulario_GUI();
        formulario1.setBounds(0, 00, 300, 450);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
    
}
