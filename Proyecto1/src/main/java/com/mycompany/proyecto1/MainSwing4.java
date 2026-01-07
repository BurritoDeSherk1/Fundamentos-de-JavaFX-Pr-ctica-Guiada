package com.mycompany.proyecto1;

import javax.swing.JFrame;

public class MainSwing4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CRUD Personas");
        frame.setContentPane(new Panel4());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
