package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame(); // 1. object creation
        var gameRunner = new GameRunner(game); // 2: object creation + wiring of dependencies
            //game is a dependency of GameRunner

        gameRunner.run();
    }
}
