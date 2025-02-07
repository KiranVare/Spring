package com.spring.jdbc.ecom.dao;

import com.spring.jdbc.ecom.model.Category;

import java.util.List;

public interface CategoryDao {

    Category createCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(int id);
}
