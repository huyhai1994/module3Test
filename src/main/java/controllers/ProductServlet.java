package controllers;

import services.ProductService;
import services.ServiceInterface;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "ProductServlet", urlPatterns = ServletUrlPath.PRODUCT)
public class ProductServlet extends HttpServlet {
    public static final String LIST = "/list";
    private ServiceInterface productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = request.getPathInfo();
        switch (url) {
            case LIST:
                try {
                    this.productService.renderPageFindAll(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
