package poo_examples.online_store;

public class Product {
    private String brand;
    private double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void ProductDetails() {
        System.out.println(brand + " - " + price + " - ");
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

}
