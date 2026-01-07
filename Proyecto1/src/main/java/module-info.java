module com.mycompany.proyecto1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.proyecto1 to javafx.fxml;
    exports com.mycompany.proyecto1;
}
