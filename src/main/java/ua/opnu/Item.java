package ua.opnu.java.inheritance.bill;

public class Item {
    private final String name;
    private final double price;
    private final double discount;

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
