package com.genecric.enumtype;

public class LevelCheck {
    public static void main(String[] args) {

        Level level= Level.HARD;

        switch(level) {

            case HARD:
                System.out.println("Hard level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case EASY:
                System.out.println("esay  level");
                break;
        }


        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
