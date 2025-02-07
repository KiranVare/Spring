package spring_jpa_ecom_mvc.Repositories;

import spring_jpa_ecom_mvc.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer> {

    public Product findByProductName(String name);

    public Product findByProductNameContaining(String name);


}
