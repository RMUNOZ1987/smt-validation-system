package com.smt.dao;

import java.sql.*;
import java.util.*;

public class ModeloDAO {

    // Método para guardar modelo
    public void guardarModelo(String nombre, String descripcion) {

        try {
            Connection con = Conexion.getConnection();

            String sql = "INSERT INTO modelos(nombre, descripcion, status) VALUES (?, ?, 'Pendiente')";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, descripcion);

            ps.executeUpdate();

            System.out.println("Modelo guardado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔥 NUEVO MÉTODO (lista de modelos)
    public List<String[]> obtenerModelos() {
        List<String[]> lista = new ArrayList<>();

        try {
            Connection con = Conexion.getConnection();

            String sql = "SELECT * FROM modelos";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String[] fila = new String[3];
                fila[0] = rs.getString("nombre");
                fila[1] = rs.getString("descripcion");
                fila[2] = rs.getString("status");

                lista.add(fila);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}

