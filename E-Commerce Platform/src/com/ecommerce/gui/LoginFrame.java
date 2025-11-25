package com.ecommerce.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {
    private JTextField txtEmail;
    private JPasswordField txtPass;

    public LoginFrame() {
        setTitle("E-Commerce Login");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
    }

    private void init() {
        JPanel panel = new JPanel(new GridLayout(3,2,5,5));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        panel.add(new JLabel("Password:"));
        txtPass = new JPasswordField();
        panel.add(txtPass);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener((ActionEvent e) -> {
            // for review1, accept any login
            ProductManagementFrame pm = new ProductManagementFrame();
            pm.setVisible(true);
            this.dispose();
        });

        panel.add(new JLabel());
        panel.add(btnLogin);
        add(panel);
    }
}
