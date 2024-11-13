module com.example.trabajogrupal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabajogrupal to javafx.fxml;
    exports com.example.trabajogrupal;
}