package com.smt.ui;

import com.smt.dao.UsuarioDAO;
import com.smt.ui.RegistroFrame;


import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginFrame() {
        setTitle("Login SMT");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3,2));

        panel.add(new JLabel("Usuario:"));
        userField = new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Password:"));
        passField = new JPasswordField();
        panel.add(passField);

        JButton loginBtn = new JButton("Login");
        panel.add(loginBtn);

        add(panel);

        loginBtn.addActionListener(e -> login());
    }

    private void login() {
        String user = userField.getText();
        String pass = new String(passField.getPassword());

        UsuarioDAO dao = new UsuarioDAO();

        if(dao.validarUsuario(user, pass)) {
            JOptionPane.showMessageDialog(this, "Login correcto");
            new RegistroFrame().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }
}