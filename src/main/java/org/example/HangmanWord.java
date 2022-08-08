package org.example;

import java.util.ArrayList;
import java.util.Random;

public class HangmanWord {
    private String hangmanWord;

    static Random random = new Random();

    public static String getRandomWord(){
        return words.get(random.nextInt(words.size()));
    }

    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("Abyss");
        words.add("Bubbly");
        words.add("Cozy");
        words.add("Danger");
        words.add("Elephant");
        words.add("Fireman");

    }
}
