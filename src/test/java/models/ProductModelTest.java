package models;

import entities.Product;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class ProductModelTest {

    @Test
    void save() throws SQLException {
        Product product = new Product();
        product.setName("aaaa");
        product.setPrice(1230.0);
        product.setCategoryId(3);
        product.setQuantity(100);
        product.setColor("YELLOW");
        ProductModel productModel = new ProductModel();
        productModel.save(product);
    }
}