package com.mycompany.proyecto1;

import javax.swing.JFrame;

public class MainSwing5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Personas");
        frame.setContentPane(new Panel5());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
