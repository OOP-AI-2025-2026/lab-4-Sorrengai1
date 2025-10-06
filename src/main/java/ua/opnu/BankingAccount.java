package ua.opnu.java.inheritance.account;

public class BankingAccount {
    private int balance;

    public BankingAccount(final Startup s) {
        this.balance = s.getBalance();
    }
    public void debit(final Debit d) {
        this.balance += d.getAmount();
    }
    public void credit(final Credit c) {
        this.balance += c.getAmount();
    }
    public int getBalance() {
        return balance;
    }
    @Override
    public boolean equals(final Object o) {
        if (this.getBalance() == 0) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingAccount that = (BankingAccount) o;
        return balance == that.balance;
    }
    @Override
    public String toString() {
        return "BankingAccount"
                + "balance=" + balance;
    }
}
