package com.smt.ui;

import com.smt.dao.ModeloDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ListaModelosFrame extends JFrame {

    JTable tabla;

    public ListaModelosFrame() {
        setTitle("Lista de Modelos");
        setSize(500,300);
        setLocationRelativeTo(null);

        tabla = new JTable();
        cargarDatos();

        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    private void cargarDatos() {
        ModeloDAO dao = new ModeloDAO();
        List<String[]> lista = dao.obtenerModelos();

        String[] columnas = {"Nombre", "Descripción", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);

        for (String[] fila : lista) {
            model.addRow(fila);
        }

        tabla.setModel(model);
    }
}

