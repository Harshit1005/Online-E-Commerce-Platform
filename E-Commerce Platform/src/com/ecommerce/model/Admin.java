package com.ecommerce.model;
public class Admin extends User {
    public Admin() { super(); }
    public void showDashboard() {
        System.out.println("Admin dashboard");
    }
}
