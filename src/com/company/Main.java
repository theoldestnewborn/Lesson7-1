package com.company;

public class Main {

    public static void main(String[] args) {
        Director dir1 = new Director("Director", 300);
        Worker wor1 = new Worker("Worker", 300);
        Accountant acc1 = new Accountant("Accountant", 300);
        dir1.infoOut();
        wor1.infoOut();
        acc1.infoOut();

    }
}
