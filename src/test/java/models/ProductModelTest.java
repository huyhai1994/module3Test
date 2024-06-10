package models;

import entities.Product;
import org.junit.jupiter.api.Test;

class ProductModelTest {

    @Test
    void save() {
        Product product = new Product();
        product.setName("a");
        product.setPrice(1230.0);
        product.setCategoryId(3);
        product.setQuantity(100);
        product.setColor("YELLOW");

        ProductModel productModel = new ProductModel();



    }
}