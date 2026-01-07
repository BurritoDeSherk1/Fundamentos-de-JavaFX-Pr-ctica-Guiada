package com.mycompany.proyecto1;

import javax.swing.table.DefaultTableModel;

public class Tarea3 {

    public static void agregarPersona(
            DefaultTableModel modelo,
            String nombres,
            String apellidos,
            int edad
    ) {
        Object[] fila = { nombres, apellidos, edad };
        modelo.addRow(fila);
    }
}
