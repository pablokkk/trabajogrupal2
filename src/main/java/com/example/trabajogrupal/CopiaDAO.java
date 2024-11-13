package com.example.trabajogrupal;

import java.util.ArrayList;
import java.util.List;

public class CopiaDAO {
    private List<String> copias;

    public CopiaDAO() {
        this.copias = new ArrayList<>();
    }

    public void agregarCopia(String copia) {
        copias.add(copia);
    }

    public List<String> obtenerCopias() {
        return new ArrayList<>(copias);
    }
}
