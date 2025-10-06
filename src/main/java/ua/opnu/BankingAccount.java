package ua.opnu.java.inheritance.account;
import java.util.Objects;

public class BankingAccount {
    private int balance;

    public BankingAccount(Startup s) {
        this.balance = s.getBalance();
    }

    public void debit(Debit d) {
        this.balance += d.getAmount();
    }

    public void credit(Credit c) {
        this.balance += c.getAmount();
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingAccount that = (BankingAccount) o;
        return balance == that.balance;
    }
    @Override
    public  int hashCode() {
        return Integer.hashCode(balance);
    }

    @Override
    public String toString() {
        return "BankingAccount{"
                + "balance=" + balance + '}';
    }
}
