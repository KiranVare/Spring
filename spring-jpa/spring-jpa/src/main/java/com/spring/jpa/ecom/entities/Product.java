package com.spring.jpa.ecom.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_product")
public class Product {

    @Id //-->this is used to represent the primary key
    @Column(name = "p_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "p_name",nullable = false,length = 500)
    private String productName;

    private String description;

    private double price;

    private boolean isLive = false;

    @ManyToOne
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(int productId, String productName, double price, String description, boolean isLive) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.isLive = isLive;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isLive=" + isLive +
                '}';
    }
}
