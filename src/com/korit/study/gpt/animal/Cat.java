package com.korit.study.gpt.animal;

public class Cat extends Animal implements Soundable{

    public Cat(String name, int age) {
        super();
    }

    @Override
    public void move() {
        System.out.println("고양이가 걷습니다");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
