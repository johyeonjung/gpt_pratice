package com.korit.study.gpt.singleton.ex1;
import com.korit.study.gpt.singleton.ex1.SignupRequest;

public class SignupService {

   SignupValidator signupValidator = new SignupValidator();
   Logger logger = Logger.getInstance();

    public void register(SignupRequest req) {
        boolean validSignup =  signupValidator.validate(req);
        if(validSignup == true) {
            logger.info("회원가입 완료");
        } else {
            logger.error("회원가입 실패");
        }
    }

}