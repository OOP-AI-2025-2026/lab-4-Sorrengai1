package ua.opnu.java.inheritance.bill;

public class Item {
    private static final double MAX_DISCOUT = 100.0;
    private String name;
    private double price;
    private double discount;

    public Item(final String name, final double price, final double discount) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Назва товару "
                    + "не може порожнбою");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        if (discount < 0 || discount > MAX_DISCOUT) {
            throw new IllegalArgumentException("Знижка має бути в"
                    + " межах 0-100%");
        }
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
