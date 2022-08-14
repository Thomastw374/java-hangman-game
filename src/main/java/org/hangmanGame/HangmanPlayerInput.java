package org.hangmanGame;

import java.util.Scanner;

public class HangmanPlayerInput {

    public static String playerInputLetter;

    public static void getPlayerInput(){
        System.out.println("Guess a letter");

        Scanner playerInputScanner = new Scanner(System.in);

        playerInputLetter = playerInputScanner.nextLine();

        System.out.println(playerInputLetter);
    }
}
