package com.korit.study.gpt.A.ex5;

public interface Verifier {
    boolean verify(String input);

    default void printResult(String input) {
        System.out.println(verify(input) ? "유효" : "무효");
    }


}
