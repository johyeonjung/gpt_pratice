package com.korit.study.gpt.signup.ex1;

public class Main {
    public static void main(String[] args) {
        SignupRequest request = new SignupRequest();
        SignupService service = new SignupService();
        service.register(request);
    }
}
