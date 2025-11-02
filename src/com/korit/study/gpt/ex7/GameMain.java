package com.korit.study.gpt.ex7;

import java.util.ArrayList;
import java.util.List;

public class GameMain {
    public static void main(String[] args) {
        Game[] games = {new LOLGame(), new MapleGame() };
        for(Game a : games) {
            a.start();
            a.run();
            a.end();

        }
    }
}
