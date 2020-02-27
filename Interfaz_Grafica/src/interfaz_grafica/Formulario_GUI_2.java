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
public class Formulario_GUI_2 extends JFrame{
    private JLabel JLabel1;
    private JLabel JLabel2;
 
    public Formulario_GUI_2(){
        setLayout(null);
        JLabel1 = new JLabel("melissa del angel esteban ;)");
        JLabel1.setBounds(10, 20, 200, 30);
        add(JLabel1);
        JLabel2 = new JLabel("Buen dia =)");
        JLabel2.setBounds(10, 40, 200, 30);
        add(JLabel2);
        
    }
    public static void main(String[] args) {
        Formulario_GUI_2  formulario2 = new Formulario_GUI_2();
        formulario2.setBounds(0, 0, 800, 600);
        formulario2.setVisible(true);
        formulario2.setResizable(false);
        formulario2.setLocationRelativeTo(null);
        
        
    }
    
    
}
