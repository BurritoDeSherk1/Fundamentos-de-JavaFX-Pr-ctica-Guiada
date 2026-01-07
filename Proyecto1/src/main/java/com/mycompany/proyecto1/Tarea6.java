package com.mycompany.proyecto1;

import javax.swing.table.DefaultTableModel;

public class Tarea6 {

    public static void agregarPersona(
            DefaultTableModel modelo,
            String nombre,
            String apellido,
            int edad
    ) {
        Object[] fila = { nombre, apellido, edad };
        modelo.addRow(fila);
    }
}
