package com.ecommerce.model;

public class User {
    private int userId;
    private String name;
    private String email;
    private String role; // ADMIN, SELLER, BUYER
    private String password;

    // constructors, getters, setters
    public User() {}
    public User(String name, String email, String role, String password) {
        this.name = name; this.email = email; this.role = role; this.password = password;
    }
    // getters/setters omitted for brevity — add them
}
