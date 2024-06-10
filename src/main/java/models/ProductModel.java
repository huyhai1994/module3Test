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

    private final Connection connection;

    public ProductModel() {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        this.connection = DatabaseConnector.getConnection();
    }

    private static void retrievingResultAndAddToProducts(ResultSet resultSet, List<Product> products) throws SQLException {
        while (true) {
            if (!resultSet.next()) break;
            String name = resultSet.getString("products.name");
            Double price = resultSet.getDouble("products.price");
            int quantity = resultSet.getInt("products.quantity");
            String color = resultSet.getString("products.color");
            String categoryName = resultSet.getString("product_category.name");
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategoryName(categoryName);
            product.setColor(color);
            products.add(product);
        }
    }



    public void save(Product product) throws SQLException {
        String sql = "INSERT INTO products(`name`, `price`, `category_id`, `quantity`, `color`) VALUE (?,?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getCategoryId());
        preparedStatement.setInt(4, product.getQuantity());
        preparedStatement.setString(5, product.getColor());
        preparedStatement.execute();
        preparedStatement.close();
    }

    public List<Product> getAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT products.name, products.price, products.quantity, products.color, product_category.name\n" +
                "        FROM products\n" +
                "        JOIN product_category ON products.category_id = product_category.id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("ProductModel here");
        ResultSet resultSet = preparedStatement.executeQuery();
        retrievingResultAndAddToProducts(resultSet, products);
        return products;
    }
}
