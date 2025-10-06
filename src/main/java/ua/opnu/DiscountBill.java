import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.Item;
import ua.opnu.java.inheritance.bill.GroceryBill;
/**
 * Клас GroceryBill моделює чек з урахуванням знижок
 * для постійних клієнтів.
 */
public final class DiscountBill extends GroceryBill {
    /** Ознака, чи є покупець постійним клієнтом.*/
    private boolean regularCustomer;
    /** Кількість товарів зі знижкою.*/
    private int discountCount = 0;
    /** Загальна сума знижки у грн.*/
    private double discountAmount = 0;
    /** Базове значення 100 для розрахунку відсотків.*/
    private static final double PERCENT_BASE = 100.0;

    public DiscountBill(final Employee clerk, final boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
    }
    @Override
    public void add(final Item i) {
        super.add(i);
        if (regularCustomer && i.getDiscount() > 0.0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    @Override
    public double getTotal() {
        double total = super.getTotal();
        double finalAmount = regularCustomer ? total - discountAmount : total;
        return Math.round(finalAmount * PERCENT_BASE) / PERCENT_BASE;
    }
    public int getDiscountCount() {
        return discountCount;
    }
    public double getDiscountAmount() {
        return discountAmount;
    }
    public double getDiscountPercent() {
        double total = super.getTotal();
        if (!regularCustomer || total == 0.0) {
            return 0.0;
        }
        double percent = PERCENT_BASE - ((total - discountAmount)
                * PERCENT_BASE / total);
        return Math.round(percent * 1e13) / 1e13;
    }
}
