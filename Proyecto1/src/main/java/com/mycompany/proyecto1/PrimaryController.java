package com.mycompany.proyecto1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtOp1;

    @FXML
    private TextField txtOp2;

    @FXML
    private TextField txtResultado;

    @FXML
    private void sumar() {
        try {
            double op1 = Double.parseDouble(txtOp1.getText());
            double op2 = Double.parseDouble(txtOp2.getText());

            double suma = op1 + op2;
            txtResultado.setText(String.valueOf(suma));

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Ingrese solo números");
            alert.showAndWait();
        }
    }
}
