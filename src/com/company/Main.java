package com.company;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer();
        programmer.setName("SARDARBEK");
        programmer.setAge(28);

        System.out.println("Name: " + programmer.getName());
        System.out.println("Age: " + programmer.getAge());

    }
}