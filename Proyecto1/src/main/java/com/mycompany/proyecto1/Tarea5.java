package com.mycompany.proyecto1;

import javax.swing.table.DefaultTableModel;

public class Tarea5 {

    public static void agregarPersona(
            DefaultTableModel modelo,
            String nombre,
            String apellido,
            int edad
    ) {
        modelo.addRow(new Object[]{nombre, apellido, edad});
    }
}
