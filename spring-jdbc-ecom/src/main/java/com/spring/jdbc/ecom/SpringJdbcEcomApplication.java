package com.spring.jdbc.ecom;

import com.spring.jdbc.ecom.dao.CategoryDao;
import com.spring.jdbc.ecom.dao.ProductDao;
import com.spring.jdbc.ecom.dao.impl.ProductDaoImpl;
import com.spring.jdbc.ecom.model.Category;
import com.spring.jdbc.ecom.model.CategoryProduct;
import com.spring.jdbc.ecom.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcEcomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcEcomApplication.class, args);

//
//
//		ProductDao product = context.getBean(ProductDao.class);
//
//
//
//		Scanner Sc = new Scanner(System.in);
//		int choice = 0;
//        do {
//			System.out.println("-***************************************-");
//			System.out.println("welcome to E-commerce App");
//			System.out.println("press 1 for adding product");
//			System.out.println("press 2 for updating product");
//			System.out.println("press 3 for deleting products");
//			System.out.println("press 4 for displaying products");
//			System.out.println("press 5 for displaying single product");
//			System.out.println("press 6 for searching product by title");
//			System.out.println("press 7 to exit");
//			System.out.println("Enter your choice:-");
//			choice = Sc.nextInt();
//
//			switch (choice)
//			{
//				case 1:
//				{
//					product.insertProduct();
//					break;
//				}
//				case 2:
//				{
//					product.updateProduct();
//					break;
//				}
//				case 3:
//				{
//					product.deleteProduct();
//					break;
//				}
//				case 4:
//				{
//					product.getAllProduct();
//					break;
//				}
//				case 5:
//				{
//					product.getProductById();
//					break;
//				}
//				case 6:
//				{
//					product.getProductByName();
//					break;
//				}
//				case 7:
//				{
//					System.out.println("Goodbye!");
//					break;
//				}
//				default:
//				{
//					System.out.println("Wrong Choice.....");
//				}
//
//			}
//
//        }while (choice!=7);
//
//
//	}
//
//		CategoryDao category = context.getBean(CategoryDao.class);
//		Category category1 = new Category();
//		category1.setId(1);
//		category1.setName("mobiles");
//		category1.setDescription("Best Selling mobile");
//		Category category2 = category.createCategory(category1);
//		System.out.println(category2);
//		System.out.println("Everything is fine");

//		CategoryDao category = context.getBean(CategoryDao.class);
//
//		Category category1 = new Category();
//		category1.setId(1);
//		category1.setName("mobiles");
//		category1.setDescription("Best mobiles in the world");
//		System.out.println(category.createCategory(category1));

		ProductDao product = context.getBean(ProductDao.class);
//		Product product1 = new Product("samsung s24", 1, "best androdid device", 124000, 1);
//		System.out.println(product.createProduct(product1));

		List<CategoryProduct> prods = product.getAllProduct(1);
		for(CategoryProduct prod : prods) {
			System.out.println(prod);
		}

	}
}
