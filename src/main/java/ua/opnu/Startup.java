package ua.opnu.java.inheritance.account;

public class Startup {
    private int initialBalance;

    public Startup(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getBalance() {
        return initialBalance;
    }
}

