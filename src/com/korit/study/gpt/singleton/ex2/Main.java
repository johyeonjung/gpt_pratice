package com.korit.study.gpt.singleton.ex2;

public class Main {
    public static void main(String[] args) {
        SignupRequest signupRequest1 = new SignupRequest("홍길동","email@naver.com","test123145");
        SignupRequest signupRequest2 = new SignupRequest("홍길동","email11@gmail.com","test12213123");

        SignupService signupService = new SignupService();
        signupService.register(signupRequest1);
        try {
            signupService.register(signupRequest2);
        }catch (DuplicateUserException e) {
            System.out.println("이미 가입된 사용자입니다");
        }
    }
}
