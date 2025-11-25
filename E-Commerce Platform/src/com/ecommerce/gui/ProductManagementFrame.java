package com.ecommerce.gui;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.impl.ProductDAOImpl;
import com.ecommerce.model.Product;
import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProductManagementFrame extends JFrame {
    private JTextField txtName, txtPrice, txtQty;
    private DefaultTableModel tableModel;
    private ProductDAO productDAO = new ProductDAOImpl();

    public ProductManagementFrame() {
        setTitle("Product Management");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        loadProducts();
    }

    private void init() {
        JPanel top = new JPanel(new GridLayout(1,6,5,5));
        txtName = new JTextField();
        txtPrice = new JTextField();
        txtQty = new JTextField();

        top.add(new JLabel("Name"));
        top.add(txtName);
        top.add(new JLabel("Price"));
        top.add(txtPrice);
        top.add(new JLabel("Qty"));
        top.add(txtQty);

        JButton btnAdd = new JButton("Add Product");
        btnAdd.addActionListener(e -> addProduct());
        JPanel north = new JPanel(new BorderLayout());
        north.add(top, BorderLayout.CENTER);
        north.add(btnAdd, BorderLayout.EAST);

        tableModel = new DefaultTableModel(new String[]{"ID","Name","Desc","Price","Qty"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(table);

        add(north, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    private void addProduct() {
        try {
            String name = txtName.getText().trim();
            double price = Double.parseDouble(txtPrice.getText().trim());
            int qty = Integer.parseInt(txtQty.getText().trim());
            Product p = new Product(name, "", price, qty, null);
            productDAO.add(p);
            JOptionPane.showMessageDialog(this, "Product added with id: " + p.getProductId());
            clearInputs();
            loadProducts();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void clearInputs() {
        txtName.setText("");
        txtPrice.setText("");
        txtQty.setText("");
    }

    private void loadProducts() {
        try {
            tableModel.setRowCount(0);
            List<Product> list = productDAO.getAll();
            for (Product p : list) {
                tableModel.addRow(new Object[]{p.getProductId(), p.getName(), p.getDescription(), p.getPrice(), p.getQuantity()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading products: " + e.getMessage());
        }
    }
}
