package spring_jpa_ecom_mvc.Repositories;

import spring_jpa_ecom_mvc.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
