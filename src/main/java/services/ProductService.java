package services;

import entities.Product;
import models.ProductModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class ProductService implements ServiceInterface {
    private ProductModel productModel;

    public ProductService() {
        productModel = new ProductModel();
    }

    @Override
    public void renderPageFindAll(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        //TODO: sending the ProductLists -> list.jsp
        List<Product> products = this.productModel.getAll();
    }

    @Override
    public void renderPageSave() {

    }

    @Override
    public void renderPageUpdate() {

    }

    @Override
    public List findAll() {
        return Collections.emptyList();
    }

    @Override
    public Object findById(int key) {
        return null;
    }

    @Override
    public void save(Object object) {

    }

    @Override
    public void update(int key, Object object) {

    }

    @Override
    public void remove(int key) {

    }
}
