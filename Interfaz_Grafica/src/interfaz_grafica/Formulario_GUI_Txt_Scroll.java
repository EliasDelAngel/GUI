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
public class Formulario_GUI_Txt_Scroll extends JFrame{
    
    private JTextField texfield;
    private JTextArea texArea;
    private JScrollPane scrolpane;
    
    public Formulario_GUI_Txt_Scroll(){
        setLayout(null);
        
        texfield = new JTextField();
        texfield.setBounds(10, 10, 100, 30);
        add(texfield);
        
        texArea = new JTextArea();
        scrolpane = new JScrollPane(texArea);
        scrolpane.setBounds(10,40, 300, 400);
        add(scrolpane);
    }
    public static void main(String[] args) {
        Formulario_GUI_Txt_Scroll texScroll = new Formulario_GUI_Txt_Scroll();
        texScroll.setBounds(0, 0, 400, 500);
        texScroll.setResizable(true);
        texScroll.setVisible(true);
        texScroll.setLocationRelativeTo(null);
    }
    
}
