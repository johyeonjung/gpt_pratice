package com.korit.study.gpt.ex4;

interface Animal {
    void sound();
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

public class AnimalMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];

        // TODO: Cat, Dog 객체 넣기
        Cat cat = new Cat();
        Dog dog = new Dog();
        animals[0] = cat;
        animals[1] = dog;

        for (Animal a : animals) {
            a.sound();
        }
    }
}