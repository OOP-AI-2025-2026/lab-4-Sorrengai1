package ua.opnu.java.inheritance.bill;

public class Item {
    private static final double MAX_DISCOUT = 100.0;
    private String name;
    private double price;
    private double discount;

    public Item(final String name, final double price, final double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}
