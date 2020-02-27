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
public class Formulario_GUI_TextA extends JFrame{  
    private JTextField texF1;
    private JTextArea textA1;
    
    public Formulario_GUI_TextA(){ 
    setLayout(null);
    texF1 = new JTextField();
    texF1.setBounds(10, 20, 200, 20);
    add(texF1);
    
    textA1 = new JTextArea();
    textA1.setBounds(10, 40, 400, 250);
        add(textA1);
        
    
}
    public static void main(String[] args) {
        Formulario_GUI_TextA forTextA = new Formulario_GUI_TextA();
        forTextA.setBounds(0, 0, 450, 300);
        forTextA.setVisible(true);
        forTextA.setResizable(false);
        forTextA.setLocationRelativeTo(null);
        
    }
    
}
