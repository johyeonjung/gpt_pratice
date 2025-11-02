package com.korit.study.gpt.singleton.ex1;
import com.korit.study.gpt.singleton.ex1.SignupRequest;

public class Main {
    public static void main(String[] args) {
        SignupRequest request = new SignupRequest("홍길동","abc@naver.com","test1234");
        SignupService service = new SignupService();
        service.register(request);

        System.out.println(Logger.getInstance().hashCode());
        System.out.println(Logger.getInstance().toString());
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());


    }
}
