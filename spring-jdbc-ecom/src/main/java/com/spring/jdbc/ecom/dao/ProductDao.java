package com.spring.jdbc.ecom.dao;

import com.spring.jdbc.ecom.model.CategoryProduct;
import com.spring.jdbc.ecom.model.Product;

import java.util.List;

public interface ProductDao {

    //insert product
    void insertProduct();

    //save product
    Product createProduct(Product product);

    //update product
    void updateProduct();

    //delete product
    void deleteProduct();

    //get-all products
    void getAllProduct();

    //get single product
    void getProductById();

    //search product
   void getProductByName();

   List<CategoryProduct> getAllProduct(int categoryId);

}
