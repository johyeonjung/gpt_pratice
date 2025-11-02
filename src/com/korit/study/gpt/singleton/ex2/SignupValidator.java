package com.korit.study.gpt.singleton.ex2;



public class SignupValidator {

    public boolean validate(SignupRequest req) {
        boolean valid = false;
        if (req.getUsername().isBlank() || req.getPassword().isBlank() || req.getEmail().isBlank()) {
            System.out.println("필수 입력 누락");
            valid = false;
        } else if (!req.getEmail().contains("@")) {
            System.out.println("이메일 형식 오류");
            valid = false;
        } else if (req.getPassword().length() < 8) {
            System.out.println("비밀번호 짧음");
            valid = false;
        } else {
            valid = true;
            System.out.println("검증 통과");
        }

        return valid;

    }

}

