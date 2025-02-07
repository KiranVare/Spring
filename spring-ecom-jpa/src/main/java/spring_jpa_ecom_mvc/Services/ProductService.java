package spring_jpa_ecom_mvc.Services;

import spring_jpa_ecom_mvc.Entities.Product;
import spring_jpa_ecom_mvc.Exception.ResourceNotFoundException;
import spring_jpa_ecom_mvc.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(int id) {
        Product product = productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product not found"));
        return product;
    }

    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public Product searchProductByName(String name) {
        Product product = productRepository.findByProductNameContaining(name);
        return product;
    };

}
