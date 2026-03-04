package com.example.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    private Long id;
    private String product;
    private double amount;

    public Order() {}

    public Order(Long id, String product, double amount) {
        this.id = id;
        this.product = product;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public String getProduct() { return product; }
    public double getAmount() { return amount; }

    public void setId(Long id) { this.id = id; }
    public void setProduct(String product) { this.product = product; }
    public void setAmount(double amount) { this.amount = amount; }
}