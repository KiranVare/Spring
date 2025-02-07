package com.spring.jdbc.ecom.dao.impl;

import com.spring.jdbc.ecom.dao.CategoryDao;
import com.spring.jdbc.ecom.model.Category;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    private JdbcTemplate jdbcTemplate;

    public CategoryDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        String createTableQuery=
                "CREATE TABLE IF NOT EXISTS category (id int primary key,name varchar(20),description varchar(200))";
        jdbcTemplate.execute(createTableQuery);
    }

    @Override
    public Category createCategory(Category category) {
        String query;
        query = "INSERT into category (id,name,description) values(?,?,?)";
        jdbcTemplate.update(query,new Object[] {category.getId(),category.getName(),category.getDescription()});

        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }
}
