package com.mycompany.proyecto1;

import javax.swing.table.DefaultTableModel;

public class Tarea4 {

    public static void agregar(DefaultTableModel modelo, String nombre, String apellido, int edad) {
        modelo.addRow(new Object[]{nombre, apellido, edad});
    }

    public static void modificar(DefaultTableModel modelo, int fila, String nombre, String apellido, int edad) {
        modelo.setValueAt(nombre, fila, 0);
        modelo.setValueAt(apellido, fila, 1);
        modelo.setValueAt(edad, fila, 2);
    }

    public static void eliminar(DefaultTableModel modelo, int fila) {
        modelo.removeRow(fila);
    }
}
