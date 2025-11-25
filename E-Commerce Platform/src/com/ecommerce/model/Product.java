package com.ecommerce.model;

public class Product {
    private int productId;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private Integer sellerId;

    public Product() {}
    public Product(String name, String description, double price, int quantity, Integer sellerId) {
        this.name = name; this.description = description; this.price = price; this.quantity = quantity; this.sellerId = sellerId;
    }

    // getters & setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Integer getSellerId() { return sellerId; }
    public void setSellerId(Integer sellerId) { this.sellerId = sellerId; }
}
