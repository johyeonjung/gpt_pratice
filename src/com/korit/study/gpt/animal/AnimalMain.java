package com.korit.study.gpt.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("댕댕이", 3);
        Animal cat = new Cat("야옹이", 4);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal a : animals) {
            a.move();

            if ( a instanceof Soundable) {
                ((Soundable)a).sound();
            }

        }

    }


}
