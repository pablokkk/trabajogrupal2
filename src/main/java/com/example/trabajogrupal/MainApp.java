package com.example.trabajogrupal;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    private CopiaDAO copiaDAO = new CopiaDAO();

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        ListView<String> listView = new ListView<>();

        // Inicializa el DAO con algunos datos
        copiaDAO.agregarCopia("Copia 1");
        copiaDAO.agregarCopia("Copia 2");
        copiaDAO.agregarCopia("Copia 3");

        ObservableList<String> items = FXCollections.observableArrayList(copiaDAO.obtenerCopias());
        listView.setItems(items);

        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Aplicación de Gestión de Copias");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
