package com.spring.aop.spring_aop.Services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void printProducts()
    {
        System.out.println("Printing Products");
        System.out.println("product 1");
        System.out.println("product 2");
        System.out.println("All products printed");
    }

}
