package com.company;

public class Accountant implements Position{
    String position;
    int salary;

    public Accountant (String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void infoOut() {
        System.out.println("Your current position is - " + position + "\nYour current salary is - " + salary);
    }
}
