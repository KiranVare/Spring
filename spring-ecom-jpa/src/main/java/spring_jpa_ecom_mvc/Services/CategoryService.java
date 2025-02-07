package spring_jpa_ecom_mvc.Services;

import spring_jpa_ecom_mvc.Entities.Category;
import spring_jpa_ecom_mvc.Exception.ResourceNotFoundException;
import spring_jpa_ecom_mvc.Repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        Category category1 = categoryRepository.save(category);
        return category1;
    }

    public Category findCategoryById(int id) {

        Category category = categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Catrgory Not Found"));
        return category;
    }

    public List<Category> findAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    public void deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

}
