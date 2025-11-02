package com.korit.study.gpt.A.ex5;

public class EmailVeri implements Verifier{
    @Override
    public boolean verify(String input) {
        if(input.contains("@")) {
            return true;
        } else {
            return false;
        }

    }

}
