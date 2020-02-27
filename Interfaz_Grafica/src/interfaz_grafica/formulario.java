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
public class formulario extends JFrame {
private JLabel label1;

  public formulario(){  
setLayout(null);
label1 = new JLabel("hola individuo lindo dia .)");
label1.setBounds(10,20,300,400);
add(label1);
  }
    public static void main(String[] args) {
      formulario formulario1 = new formulario();
      formulario1.setBounds(350,0,400, 300);
      formulario1.setVisible(true);
      formulario1.setLocationRelativeTo(null);
    }
    
}