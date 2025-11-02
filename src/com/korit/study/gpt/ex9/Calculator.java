package com.korit.study.gpt.ex9;

public interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
}

