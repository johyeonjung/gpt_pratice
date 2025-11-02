package com.korit.study.gpt.signup.ex1;

public class SignupService {

    SignupValidator signupValidator = new SignupValidator();

    public void register(SignupRequest signupRequest) {
        boolean validSignup =  signupValidator.validate(signupRequest) ;

        if(validSignup == true) {
            System.out.println("회원가입 완료");
        } else {
            System.out.println("회원가입 실패");
        }
    }

}
