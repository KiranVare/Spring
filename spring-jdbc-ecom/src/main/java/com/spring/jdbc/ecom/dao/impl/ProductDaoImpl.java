package com.spring.jdbc.ecom.dao.impl;

import com.spring.jdbc.ecom.dao.ProductDao;
import com.spring.jdbc.ecom.model.CategoryProduct;
import com.spring.jdbc.ecom.model.Product;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class ProductDaoImpl implements ProductDao {

    Scanner Sc = new Scanner(System.in);

    private JdbcTemplate jdbcTemplate;

    //by-default : constructor injection

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

        //creating table
        String createQuery = "CREATE TABLE IF NOT EXISTS product(id int primary key,name varchar(200) not null,description varchar(500),price int,categoryId int,FOREIGN KEY (categoryId) REFERENCES category(id))";
        jdbcTemplate.execute(createQuery);
    }

    @Override
    public void insertProduct() {


    }

    @Override
    public Product createProduct(Product product) {
        String query = "insert into product(id,name,description,price,categoryId) values(?,?,?,?,?)";

        int rowAffected = jdbcTemplate.update(query, product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getCategoryId());

        if(rowAffected >0)
        {
            System.out.println("Rows affected: " + rowAffected);
        }
        return product;
    }

    @Override
    public void updateProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void getAllProduct() {

    }

    @Override
    public void getProductById() {

    }

    @Override
    public void getProductByName() {

    }

    @Override
    public List<CategoryProduct> getAllProduct(int categoryId) {
        String query = "SELECT c.id AS categoryId, c.name AS categoryName, p.id AS productId, p.name AS productName " +
                "FROM product p INNER JOIN category c ON p.categoryId = c.id WHERE c.id = ?";

        return jdbcTemplate.query(query, new Object[]{categoryId}, (rs, rowNum) -> {
            CategoryProduct categoryProduct = new CategoryProduct();
            categoryProduct.setCategoryId(rs.getInt("categoryId"));
            categoryProduct.setCategoryName(rs.getString("categoryName"));
            categoryProduct.setProductId(rs.getInt("productId"));
            categoryProduct.setProductName(rs.getString("productName"));
            return categoryProduct;
        });
    }


//
//    private boolean checkIfProductExists(int productId) {
//        String query = "SELECT count(*) FROM product where id=?";
//        int count = jdbcTemplate.queryForObject(query, new Object[]{productId}, Integer.class);
//        return count > 0;
//
//    }
//
//
//    @Override
//    public void insertProduct() {
//
//        boolean idExists;
//        int productId;
//        do {
//            System.out.println("Enter Product Id:");
//            productId = Sc.nextInt();
//            Sc.nextLine(); // Consume newline
//
//            // Check if the product ID already exists
//            idExists = checkIfProductExists(productId);
//
//            if (idExists) {
//                System.out.println("Error: Product ID already exists! Please choose a different ID.");
//            }
//
//        } while (idExists); // Repeat until a unique ID is entered
//        Sc.nextLine();
//        System.out.println("Enter Product Name:");
//        String name = Sc.nextLine();
//        System.out.println("Enter Product Description:");
//        String description = Sc.nextLine();
//        System.out.println("Enter Product Price");
//        int price = Sc.nextInt();
//        Product product1 = new Product();
//        product1.setId(productId);
//        product1.setName(name);
//        product1.setDescription(description);
//        product1.setPrice(price);
//        try {
//            createProduct(product1);
//            System.out.println("Product Added Successfully");
//        } catch (DuplicateKeyException e) {
//            System.out.println("Duplicate key : Please Try Another one.");
//        }
//    }
//
//    @Override
//    public Product createProduct(Product product) {
//        String query = "insert into product(id,name,description,price) values(?,?,?,?)";
//
//        int rowAffected = jdbcTemplate.update(
//                query,
//                product.getId(),
//                product.getName(),
//                product.getDescription(),
//                product.getPrice()
//        );
//        System.out.println(rowAffected + "rows Affected");
//        return product;
//    }
//
//    @Override
//    public void updateProduct() {
//
//        System.out.println("Please Enter the product id:");
//        int productId = Sc.nextInt();
//        boolean exists = checkIfProductExists(productId);
//        if (exists) {
//            System.out.println("please Enter the product Price");
//            int price = Sc.nextInt();
//            String query = "update product set price = ? where id = ? ";
//            int rowAffected = jdbcTemplate.update(query, price, productId);
//            if (rowAffected > 0) {
//                System.out.println("Product Updated Success");
//            } else {
//                System.out.println("no update Performed");
//            }
//        } else {
//            System.out.println("Product ID Does not Exist Please try Again...");
//        }
//    }
//
//    @Override
//    public void deleteProduct() {
//        System.out.println("Please Enter the Product Id Which You Want to Delete:");
//        int productId = Sc.nextInt();
//        boolean exists = checkIfProductExists(productId);
//        if (exists) {
//            String query = "delete from product where id = ?";
//            int rowAffected = jdbcTemplate.update(query, productId);
//            if (rowAffected > 0) {
//                System.out.println("Product Deleted Successfully");
//            }
//        } else {
//            System.out.println("Product Not Found");
//        }
//    }
//
//    public void displayProducts(List<Product> products) {
//
//        for (Product product : products) {
//            System.out.println("-***************************************-");
//            System.out.println("product            id:-" + product.getId());
//            System.out.println("product          name:-" + product.getName());
//            System.out.println("product   description:-" + product.getDescription());
//            System.out.println("product         price:-" + product.getPrice());
//
//        }
//    }
//
//    @Override
//    public void getAllProduct() {
//
//        String query = "SELECT * FROM product";
//
//        //rowMapper concept -->applies here
//        List<Product> products = jdbcTemplate.query(query, new RowMapper<Product>() {
//            @Override
//            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Product product = new Product();
//                product.setId(rs.getInt("id"));
//                product.setName(rs.getString("name"));
//                product.setDescription(rs.getString("description"));
//                product.setPrice(rs.getInt("price"));
//
//                //this will automatically return
//                // the list.--> no need for the loop now
//                return product;
//            }
//        });
//
//        displayProducts(products);
//    }
//
//    @Override
//    public void getProductById() {
//
//        String query = "SELECT * FROM product where id= ?";
//
//        //using JDBC Template for getting single product
//        System.out.println("Enter the product ID:");
//        int productId = Sc.nextInt();
//        boolean productExists = checkIfProductExists(productId);
//        if (productExists) {
////            Product product = jdbcTemplate.queryForObject(query, new Object[]{productId},new RowMapper<Product>(){
////
////                @Override
////                public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
////                    Product product = new Product();
////                    product.setId(rs.getInt("id"));
////                    product.setName(rs.getString("name"));
////                    product.setDescription(rs.getString("description"));
////                    product.setPrice(rs.getInt("price"));
////                    return product;
////                }
//
//            Product product = jdbcTemplate.queryForObject(query, new Object[]{productId}, (rs, rowNum) -> {
//                Product p = new Product();
//                p.setId(rs.getInt("id"));
//                p.setName(rs.getString("name"));
//                p.setDescription(rs.getString("description"));
//                p.setPrice(rs.getInt("price"));
//                return p;
//            });
//        List<Product> products = new ArrayList<Product>();
//        products.add(product);
//        displayProducts(products);
//    }
//        else{
//        System.out.println("Product ID Does not Exist Please try Again...");
//    }
//
//
//}
//
//
//@Override
//public void getProductByName() {
//
//    String query = "SELECT * FROM product where name LIKE ?";
//    System.out.println("Enter the product name:");
//    String keyword = Sc.next();
//
//    List<Product> products = jdbcTemplate.query(query, new Object[]{"%" + keyword + "%"}, new RowMapper<Product>() {
//        @Override
//        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Product product = new Product();
//            product.setId(rs.getInt("id"));
//            product.setName(rs.getString("name"));
//            product.setDescription(rs.getString("description"));
//            product.setPrice(rs.getInt("price"));
//
//            return product;
//        }
//    });
//    displayProducts(products);
//}

}
