package com.korit.study.gpt.animal;

public abstract class Animal {
    String name;
    int age;

    void printInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract void move();
}
