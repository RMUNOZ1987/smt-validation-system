package com.smt.ui;

import com.smt.dao.ModeloDAO;
import com.smt.ui.ListaModelosFrame;

import javax.swing.*;
import java.awt.*;

public class RegistroFrame extends JFrame {

    JTextField nombreField;
    JTextArea descripcionArea;

    public RegistroFrame() {
        setTitle("Registrar Modelo");
        setSize(400,300);
        setLocationRelativeTo(null);

        // 🔥 Cambiamos a 5 filas para agregar botón extra
        JPanel panel = new JPanel(new GridLayout(5,1));

        panel.add(new JLabel("Nombre del modelo:"));
        nombreField = new JTextField();
        panel.add(nombreField);

        panel.add(new JLabel("Descripción:"));
        descripcionArea = new JTextArea();
        panel.add(descripcionArea);

        JButton guardarBtn = new JButton("Guardar");
        panel.add(guardarBtn);

        // 🔥 BOTÓN NUEVO
        JButton verListaBtn = new JButton("Ver Modelos");
        panel.add(verListaBtn);

        add(panel);

        guardarBtn.addActionListener(e -> guardarModelo());

        // 🔥 Acción para abrir tabla
        verListaBtn.addActionListener(e -> new ListaModelosFrame().setVisible(true));
    }

    private void guardarModelo() {
        String nombre = nombreField.getText();
        String descripcion = descripcionArea.getText();

        ModeloDAO dao = new ModeloDAO();
        dao.guardarModelo(nombre, descripcion);

        JOptionPane.showMessageDialog(this, "Modelo guardado");
    }
}
