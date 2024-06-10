package entities;

class ProductTest {

    private static void printProductsFromDataBase(Product product) {
        System.out.print(product.getName());
        System.out.print(product.getPrice());
        System.out.print(product.getQuantity());
        System.out.print(product.getColor());
        System.out.print(product.getCategoryName());
        System.out.println("\n");

    }
}