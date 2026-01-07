package com.mycompany.proyecto1;

import javax.swing.JOptionPane;

public class Panel1 extends javax.swing.JPanel {

    public Panel1() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        Operando1 = new javax.swing.JLabel();
        Operando2 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        txtOp1 = new javax.swing.JTextField();
        txtOp2 = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();

        jButton3.setText("Suma");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        Operando1.setText("Operando1");

        Operando2.setText("Operando2");

        Resultado.setText("Resultado");

        txtOp1.setText("Texto1");
        txtOp1.addActionListener(this::txtOp1ActionPerformed);

        txtOp2.setText("Texto2");

        txtResultado.setText("Texto3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Operando1)
                    .addComponent(Operando2)
                    .addComponent(Resultado))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addComponent(txtOp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operando1)
                    .addComponent(txtOp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operando2)
                    .addComponent(txtOp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resultado)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOp1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Operando1;
    private javax.swing.JLabel Operando2;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField txtOp1;
    private javax.swing.JTextField txtOp2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

 

}
