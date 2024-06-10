package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String color;
    private Category category;

    public Product() {
        category = new Category();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategoryName() {
        return category.getName();
    }

    public void setCategoryName(String category) {
        this.category.setName(category);
    }

    public int getCategoryId() {
        return this.category.getId();
    }

    public void setCategoryId(int id) {
        this.category.setId(id);
    }
}
