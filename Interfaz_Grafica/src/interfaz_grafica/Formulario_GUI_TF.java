/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_grafica;

import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eliasangel
 */
public class Formulario_GUI_TF extends JFrame implements ActionListener {

    private JTextField textfiel1;
    private JLabel label1;
    private JButton boto1;
    private JButton boton2;
    public Formulario_GUI_TF() {
        setLayout(null);

        label1 = new JLabel("Usuario");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textfiel1 = new JTextField();
        textfiel1.setBounds(120, 17, 150, 30);
        add(textfiel1);

        boto1 = new JButton("Aceptar");
        boto1.setBounds(10, 100, 100, 30);
        add(boto1);
        boto1.addActionListener(this);

        boton2 = new JButton("Salir");
        boton2.setBounds(110, 100, 80, 30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boto1) {
            String texto = textfiel1.getText();
            setTitle(texto);
        }if (e.getSource() == boton2) {
            System.exit(0);
        }
        

    }
    public static void main(String[] args) {
        Formulario_GUI_TF formulario = new Formulario_GUI_TF();
        formulario.setBounds(0, 0, 300, 170);
        formulario.setVisible(true);
        formulario.setResizable(true);
        formulario.setLocationRelativeTo(null);
    }

}
