package spring_jpa_ecom_mvc;

import spring_jpa_ecom_mvc.Entities.Category;
import spring_jpa_ecom_mvc.Entities.Product;
import spring_jpa_ecom_mvc.Services.CategoryService;
import spring_jpa_ecom_mvc.Services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJpaEcomApplication implements CommandLineRunner {
	private CategoryService categoryService;
	private ProductService productService;

	public SpringJpaEcomApplication(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaEcomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//for creating product
//		System.out.println("running fine");
//		Product product = new Product();
//		product.setProductName("Firebollt Exlipse luxe");
//		product.setProductDescription("Amoled Display Watch");
//		product.setLive(true);
//		productService.createProduct(product);

		//let check its method
		//for getting product by id
//		Product product1 = productService.getProductById(1);
//		System.out.println(product1);

//		List<Product> allProducts = productService.getAllProducts();
//		allProducts.forEach(System.out::println);

		//creating Category:
//		Category category = new Category();
//		category.setCategoryName("Trending");
//		category.setCategoryDescription("Trending Category");
//		Category category1 = categoryService.createCategory(category);
//		System.out.println(category1);


	}
}
