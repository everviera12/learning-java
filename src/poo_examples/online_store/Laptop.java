package poo_examples.online_store;

public class Laptop extends Product {

    private String processor;

    public Laptop(String brand, double price, String processor) {
        super(brand, price);
        this.processor = processor;
    }

    @Override
    public void ProductDetails() {
        System.out.println(getBrand() + " - " + getPrice() + " - " + processor);
    }
}
