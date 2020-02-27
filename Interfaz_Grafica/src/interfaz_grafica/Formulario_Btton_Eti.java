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
public class Formulario_Btton_Eti extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3;
    private JLabel etiqueta;

    public Formulario_Btton_Eti() {
        setLayout(null);
        boton1 = new JButton("Boton 1");
        boton1.setBounds(10, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Boton 2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Boton 3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        etiqueta = new JLabel("Boton en espera...");
        etiqueta.setBounds(10, 10, 300, 30);
        add(etiqueta);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
            etiqueta.setText("has presionado el boton 1");
        }
        if (e.getSource() == boton2) {
            etiqueta.setText("has presionado el boton 2");
        }
        if (e.getSource() == boton3) {
            etiqueta.setText("has presionado el boton 3");
        }

    }
    public static void main(String[] args) {
        Formulario_Btton_Eti  bt = new Formulario_Btton_Eti();
        bt.setBounds(0, 0, 300, 200);
        bt.setVisible(true);
        bt.setResizable(false);
        bt.setLocationRelativeTo(null);
        
    }
}
