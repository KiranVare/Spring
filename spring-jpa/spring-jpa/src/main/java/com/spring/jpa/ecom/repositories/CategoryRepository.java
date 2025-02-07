package com.spring.jpa.ecom.repositories;

import com.spring.jpa.ecom.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer>{

    List<Category> findAllByCategoryNameContaining(String categoryName);





}
