package spring_jpa_ecom_mvc.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_products")
public class Product {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int productId;

    private String productName;

    private String productDescription;

    private boolean isLive = true;

    @ManyToOne
    private Category category;


    public Product() {
    }

    public Product(int productId, String productName, String productDescription, boolean isLive) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.isLive = isLive;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", isLive=" + isLive +
                '}';
    }
}
