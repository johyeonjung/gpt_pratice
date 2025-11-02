package com.korit.study.gpt.singleton.ex1;

import com.korit.study.gpt.singleton.ex1.SignupRequest;


public class SignupValidator {
    Logger logger = Logger.getInstance();
    public boolean validate(SignupRequest req) {
        boolean valid = false;
        if (req.getUsername().isBlank() || req.getPassword().isBlank() || req.getEmail().isBlank()) {
            logger.error("필수입력누락");
            valid = false;
        } else if (!req.getEmail().contains("@")) {
            logger.error("이메일 형식 오류");
            valid = false;
        } else if (req.getPassword().length() < 8) {
            logger.error("비밀번호 짧음");
            valid = false;
        } else {
            valid = true;
            logger.info("통과");
        }

        return valid;

    }

}
