package com.korit.study.gpt.pay;

public class KaKaoPay implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이결제" + amount + "원");
    }
}
