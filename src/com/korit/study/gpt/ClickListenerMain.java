package com.korit.study.gpt;

interface ClickListener {
    void onClick();
}

public class ClickListenerMain {
    public static void main(String[] args) {
        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("클림됨!");
            }
        };
        clickListener.onClick();
    }
}

