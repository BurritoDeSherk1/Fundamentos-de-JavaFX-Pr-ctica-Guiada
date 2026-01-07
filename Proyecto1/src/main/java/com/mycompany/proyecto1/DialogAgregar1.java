package com.mycompany.proyecto1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DialogAgregar1 extends JDialog {

    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEdad;
    private JButton btnGuardar;

    private DefaultTableModel modelo;
    private int filaEditar; // -1 = agregar | >=0 = modificar

    // ===== CONSTRUCTOR PARA AGREGAR =====
    public DialogAgregar1(JFrame parent, DefaultTableModel modelo) {
        super(parent, "Agregar Persona", true);
        this.modelo = modelo;
        this.filaEditar = -1;

        initUI();
        setLocationRelativeTo(parent);
    }

    // ===== CONSTRUCTOR PARA MODIFICAR =====
    public DialogAgregar1(
            JFrame parent,
            DefaultTableModel modelo,
            int fila,
            String nombre,
            String apellido,
            int edad
    ) {
        super(parent, "Modificar Persona", true);
        this.modelo = modelo;
        this.filaEditar = fila;

        initUI();

        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtEdad.setText(String.valueOf(edad));

        setLocationRelativeTo(parent);
    }

    // ===== INTERFAZ =====
    private void initUI() {
        txtNombre = new JTextField(15);
        txtApellido = new JTextField(15);
        txtEdad = new JTextField(5);
        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(e -> guardar());

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Nombre"));
        add(txtNombre);

        add(new JLabel("Apellido"));
        add(txtApellido);

        add(new JLabel("Edad"));
        add(txtEdad);

        add(Box.createVerticalStrut(10));
        add(btnGuardar);

        pack();
    }

    // ===== GUARDAR (AGREGA O MODIFICA) =====
    private void guardar() {
        try {
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            int edad = Integer.parseInt(txtEdad.getText().trim());

            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }

            if (filaEditar == -1) {
                // AGREGAR
                Tarea6.agregarPersona(modelo, nombre, apellido, edad);
            } else {
                // MODIFICAR
                modelo.setValueAt(nombre, filaEditar, 0);
                modelo.setValueAt(apellido, filaEditar, 1);
                modelo.setValueAt(edad, filaEditar, 2);
            }

            dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad inválida");
        }
    }
}
