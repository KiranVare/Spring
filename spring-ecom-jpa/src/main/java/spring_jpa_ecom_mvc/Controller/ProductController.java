package spring_jpa_ecom_mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_jpa_ecom_mvc.Entities.Product;
import spring_jpa_ecom_mvc.Repositories.ProductRepository;
import spring_jpa_ecom_mvc.Services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/getproducts")
    public List<Product> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return allProducts;
    }

    @GetMapping("/getProductBy/{id}")
    public Product getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
        return product;
    }

    @GetMapping("/searchProductByName/{name}")
    public Product getProductByName(@PathVariable String name) {
        Product product = productService.searchProductByName(name);
        return product;
    };
}
