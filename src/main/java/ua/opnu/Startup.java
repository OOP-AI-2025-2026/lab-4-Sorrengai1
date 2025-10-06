package ua.opnu.java.inheritance.account;

public class Startup {
    private int initialBalanc;

    public Startup(final int initialBalanc) {
        this.initialBalanc = initialBalanc;
    }
    public int getBalance() {
        return initialBalanc;
    }
}

