package com.company;

public class Programmer {
private String name;
private int age;

    String getName () {
    return name;}

    int getAge () {
    return age;}

    void setName (String name){
        this.name = name;}

    void setAge (int age) {
        this.age = age;}

private void coding () {
    System.out.println("Coding in Java");
}

void coding1 () {
    System.out.println(name);
    System.out.println(age);
    coding();

}}
