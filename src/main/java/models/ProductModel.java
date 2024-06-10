package models;

import databases.DatabaseConnector;
import entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private Connection connection;

    public ProductModel() {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        this.connection = databaseConnector.getConnection();
    }

    public List<Product> getAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT products.name, products.price, products.quantity, products.color, product_category.name\n" +
                "        FROM products\n" +
                "        JOIN product_category ON products.category_id = product_category.id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("ProductModel here");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("products.name");
            System.out.println(name);
            Double price = resultSet.getDouble("products.price");
            System.out.println(price);
            int quantity = resultSet.getInt("products.quantity");
            System.out.print(quantity);
            String color = resultSet.getString("products.color");
            System.out.println(color);
            String categoryName = resultSet.getString("product_category.name");
            System.out.println(categoryName);
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory(categoryName);
            product.setColor(color);

            products.add(product);
        }
        return products;
    }
}
