package com.mycompany.proyecto1;

import javax.swing.JFrame;

public class MainSwing3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabla de Personas");
        frame.setContentPane(new Panel3());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
