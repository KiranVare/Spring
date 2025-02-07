package com.spring.jpa.ecom.repositories;

import com.spring.jpa.ecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


    //custom methods
    Product findByProductName(String name);

    //methods
    Product findByProductNameAndProductId(String name, int id);

    List<Product> findAllByProductNameContaining(String name);

    int countByProductName(String productName);

    boolean existsByProductName(String name);


    //custom methods
//    @Query(nativeQuery = true,value = "select * from jpa_product where p_name = productName")
//    Product getAllByProductName(@Param("productName") String productName);

    @Query(nativeQuery = true, value = "SELECT * FROM jpa_product WHERE p_name = :productName")
    Product getAllByProductName(@Param("productName") String productName);

}
