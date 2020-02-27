/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author eliasangel
 */
public class Formulario_GUI_TexFtexA extends JFrame implements ActionListener {

    private JTextField texField;
    private JTextArea textArea;
    private JScrollPane scrPane;
    private JButton botton;
    private String texto;

    public Formulario_GUI_TexFtexA() {
        setLayout(null);
        texField = new JTextField();
        texField.setBounds(10, 10, 200, 30);
        add(texField);

        botton = new JButton("AGREGAR");
        botton.setBounds(250, 10, 150, 30);
        add(botton);
        botton.addActionListener(this);

        textArea = new JTextArea();
        scrPane = new JScrollPane(textArea);
        scrPane.setBounds(10, 80, 500, 300);
        add(scrPane);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botton) {
            texto += texField.getText() + "\n";
            textArea.setText(texto);
            texField.setText("");
        }

    }

    public static void main(String[] args) {
        Formulario_GUI_TexFtexA teaTexfield = new Formulario_GUI_TexFtexA();
        teaTexfield.setBounds(0, 0, 600, 600);
        teaTexfield.setVisible(true);
        teaTexfield.setResizable(false);
        teaTexfield.setLocationRelativeTo(null);
    }
}
