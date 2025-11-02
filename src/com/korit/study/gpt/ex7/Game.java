package com.korit.study.gpt.ex7;

public abstract class Game {
    void start()
    {
        System.out.println("게임 시작");
    }
    void end(){
        System.out.println("게임 종료");
    }
    public abstract void run();
}
