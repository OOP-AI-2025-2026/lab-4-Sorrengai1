package ua.opnu.java.inheritance.account;

public class MinMaxAccount extends BankingAccount {
    private int minBalance;
    private int maxBalance;

    public MinMaxAccount(final Startup s) {
        super(s);
        int initialBalance = super.getBalance();
        this.minBalance = initialBalance;
        this.maxBalance = initialBalance;
    }
    @Override
    public void debit(final Debit d) {
        super.debit(d);
        updateMinMax();
    }
    @Override
    public void credit(final Credit c) {
        super.credit(c);
        updateMinMax();
    }

    private void updateMinMax() {
        int current = super.getBalance();
        if (current < minBalance) {
            minBalance = current;
        }
        if (current > maxBalance) {
            maxBalance = current;
        }
    }
        public int getMin() {
            return minBalance;
        }
        public int getMax() {
            return maxBalance;
        }
}
