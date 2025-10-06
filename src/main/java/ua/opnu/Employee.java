package ua.opnu.java.inheritance.bill;

public class Employee {
    private final String name;

    public Employee(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Ім'я працівника не може бути порожнім");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
