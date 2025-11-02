package com.korit.study.gpt.animal;

public class Dog extends Animal implements Soundable {

    public Dog(String name, int age) {
        super();
    }

    @Override
    public void move() {
        System.out.println("강아지가 달립니다");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
