package com.spring.jpa.ecom;

import com.spring.jpa.ecom.Services.CategoryService;
import com.spring.jpa.ecom.Services.ProductService;
import com.spring.jpa.ecom.entities.Category;
import com.spring.jpa.ecom.entities.Product;
import com.spring.jpa.ecom.repositories.CategoryRepository;
import com.spring.jpa.ecom.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {


	private ProductService productService;
	private CategoryService categoryService;

	public SpringJpaApplication(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Product product = new Product();
//		product.setProductName("Oppo A9 2020");
//		product.setDescription("Kiran Legendary phone");
//		product.setPrice(122999);
//		product.setLive(true);
//		Product product1 = productService.createProduct(product);

//	 after creating or setting the category you need to save it again
//		Product product = productService.getProductById(3);
//		Category category = categoryService.getCategoryById(2);
//		product.setCategory(category);
//		Product product2 = productService.createProduct(product);

//		System.out.println(product1);
//		productService.getAllProducts().forEach(System.out::println);//to print all products;

//		System.out.println(productService.getProductById(3));
//		productService.deleteProductById(3);
//		Product product = productService.getProductbyName()

//		Category category = new Category();
//		category.setCategory_id(2);
//		category.setCategory_name("Mobile");
//		category.setCategory_description("Best Mobile over Internet");
//		Category cat1 =	categoryService.createCategory(category);
//		System.out.println(cat1);

	}


}
