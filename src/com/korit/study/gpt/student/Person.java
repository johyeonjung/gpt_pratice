package com.korit.study.gpt.student;

public abstract class Person {
    String id;
    String name;

    public void rename(String name) {
        this.name = name;
    }
    public abstract void describe();
}
