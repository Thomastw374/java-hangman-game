package org.hangmanGame;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanPlayerInput {

    public static ArrayList<String> playerInputLetter = new ArrayList<String>();

    public static void getPlayerInput(){
        System.out.println("Guess a letter");

        Scanner playerInputScanner = new Scanner(System.in);

        playerInputLetter.add(playerInputScanner.nextLine().toLowerCase());

        System.out.println(playerInputLetter);
    }
}
