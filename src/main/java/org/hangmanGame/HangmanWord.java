package org.hangmanGame;

import java.util.ArrayList;
import java.util.Random;

public class HangmanWord {
    public static String hangmanWord = "";

    static Random random = new Random();



    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("Abyss");
        words.add("Bubbly");
        words.add("Cozy");
        words.add("Danger");
        words.add("Elephant");
        words.add("Fireman");

    }

    public static void getRandomWord(){
        hangmanWord = words.get(random.nextInt(words.size()));
    }
}
