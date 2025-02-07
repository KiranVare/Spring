package com.spring.jpa.ecom.Services;

import com.spring.jpa.ecom.entities.Category;
import com.spring.jpa.ecom.repositories.CategoryRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    //creating a Criteria API

    //step 1 :- injection of the Entity Manager ,
    // here we usually use constructor injection
    private EntityManager entityManager;

    private CategoryRepository categoryRepository;

    public CategoryService(EntityManager entityManager, CategoryRepository categoryRepository) {
        this.entityManager = entityManager;
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public Category getCategoryById(int id) {
        categoryRepository.findById(id);
        return categoryRepository.findById(id).get();
    };

    public List<Category> getAllCategories() {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);

        Root<Category> root = criteriaQuery.from(Category.class);

        Predicate predicate1 = criteriaBuilder.equal(root.get("categoryId"), 1);

        Predicate predicate2 = criteriaBuilder.equal(root.get("categoryName"), "trending");

        Predicate predicate3 = criteriaBuilder.or(predicate1, predicate2);

        Order nameOrder = criteriaBuilder.asc(root.get("categoryName"));


        //start
        criteriaQuery.select(root).where(predicate3).orderBy(nameOrder);

        //end

        List<Category> resultList = entityManager.createQuery(criteriaQuery).getResultList();

        return resultList;
    };




}
