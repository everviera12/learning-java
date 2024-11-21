package poo_examples.online_store;

public class Phone extends Product {

    private String phone_company;

    public Phone(String brand, double price, String phone_company) {
        super(brand, price);
        this.phone_company = phone_company;
    }

    @Override
    public void ProductDetails() {
        System.out.println(getBrand() + " - " + getPrice() + " - " + phone_company);
    }
}
