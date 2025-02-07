package com.spring.jpa.ecom.Services;

import com.spring.jpa.ecom.entities.Product;
import com.spring.jpa.ecom.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product productEntity) {
        Product product = productRepository.save(productEntity);
        return product;
    }

    public List<Product> getAllProducts() {

        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product getProductById(int id)
    {
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("product not found with this id"));
        return product;
    }

    public void deleteProductById(int id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

    public Product getProductbyName(String productName) {
        Product product = productRepository.getAllByProductName(productName);
        return product;
    };

}
