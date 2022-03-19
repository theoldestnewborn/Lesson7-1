package com.company;

public class Worker implements Position{
    String position;
    int salary;

    public Worker (String position, int salary) {
        this.position = position;
        this.salary = salary;

    }

    @Override
    public void infoOut() {
        System.out.println("Your current position is - " + position + "\nYour current salary is - " + salary);
    }
}
