package com.mycompany.proyecto1;

import javax.swing.JOptionPane;

public class Panel2 extends javax.swing.JPanel {

    public Panel2() {
        initComponents();
    }
    // === BOTÓN OPERAR ===


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Operando1 = new javax.swing.JLabel();
        Operando2 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JTextField();
        Texto1 = new javax.swing.JTextField();
        Operar = new javax.swing.JButton();
        Suma = new javax.swing.JRadioButton();
        Multiplicacion = new javax.swing.JRadioButton();
        Resta = new javax.swing.JRadioButton();
        Division = new javax.swing.JRadioButton();

        Operando1.setText("Operando1");

        Operando2.setText("Operando2");

        Texto2.setText("Texto2");

        Texto1.setText("Texto1");

        Operar.setText("Operar");
        Operar.addActionListener(this::OperarActionPerformed);

        Suma.setText("Suma");
        Suma.setActionCommand("Suma");
        Suma.addActionListener(this::SumaActionPerformed);

        Multiplicacion.setText("Multiplicacion");

        Resta.setText("Resta");

        Division.setText("Division");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Suma)
                            .addComponent(Multiplicacion))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resta)
                            .addComponent(Division)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Operar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Operando2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Operando1)
                                .addGap(70, 70, 70)
                                .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operando1)
                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operando2)
                    .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Operar)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suma)
                    .addComponent(Resta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Division)
                    .addComponent(Multiplicacion))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

    private void OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperarActionPerformed
       try {
        double op1 = Double.parseDouble(Texto2.getText()); // Operando1
        double op2 = Double.parseDouble(Texto1.getText()); // Operando2

        double resultado;

        if (Suma.isSelected()) {
            resultado = Tarea2.sumar(op1, op2);
        } else if (Resta.isSelected()) {
            resultado = Tarea2.restar(op1, op2);
        } else if (Multiplicacion.isSelected()) {
            resultado = Tarea2.multiplicar(op1, op2);
        } else if (Division.isSelected()) {
            resultado = Tarea2.dividir(op1, op2);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una operación");
            return;
        }

        JOptionPane.showMessageDialog(this, "Resultado: " + resultado);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese solo números");
    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }  


// TODO add your handling code here:
    }//GEN-LAST:event_OperarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Division;
    private javax.swing.JRadioButton Multiplicacion;
    private javax.swing.JLabel Operando1;
    private javax.swing.JLabel Operando2;
    private javax.swing.JButton Operar;
    private javax.swing.JRadioButton Resta;
    private javax.swing.JRadioButton Suma;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Texto2;
    // End of variables declaration//GEN-END:variables
}
