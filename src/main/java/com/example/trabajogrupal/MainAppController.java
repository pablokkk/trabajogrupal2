package com.example.trabajogrupal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MainAppController {
    @FXML
    private ListView<String> listView;

    private CopiaDAO copiaDAO = new CopiaDAO();

    @FXML
    public void initialize() {
        // Inicializa el DAO con algunos datos
        copiaDAO.agregarCopia("Copia 1");
        copiaDAO.agregarCopia("Copia 2");
        copiaDAO.agregarCopia("Copia 3");

        ObservableList<String> items = FXCollections.observableArrayList(copiaDAO.obtenerCopias());
        listView.setItems(items);
    }
}
