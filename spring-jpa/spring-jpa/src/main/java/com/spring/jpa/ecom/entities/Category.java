package com.spring.jpa.ecom.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jpa_category")
public class Category {

    @Id
    private int categoryId;

    private String categoryName;

    private String categoryDescription;

//    @OneToOne(mappedBy = "category")
//    private Product product;

    @OneToMany(mappedBy = "category")
    private List<Product> product;


    public Category() {
    }

    public Category(int categoryId, String categoryDescription, String categoryName) {
        this.categoryId = categoryId;
        this.categoryDescription = categoryDescription;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                ", product=" + product +
                '}';
    }
}

