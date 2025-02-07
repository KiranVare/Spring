package com.spring.jpa.ecom;

import com.spring.jpa.ecom.Services.CategoryService;
import com.spring.jpa.ecom.entities.Category;
import com.spring.jpa.ecom.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryService categoryService;

	@Test
	void contextLoads() {
	}

	@Test
	public void findLikeContaining()
	{
		List<Category> cat = categoryRepository.findAllByCategoryNameContaining("phone");
		System.out.println(cat);
    }

	@Test
	public void getList()
	{
		List<Category> cat = categoryService.getAllCategories();
	}




}
