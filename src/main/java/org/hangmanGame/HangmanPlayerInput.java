package org.hangmanGame;

import java.util.Scanner;

public class HangmanPlayerInput {

    public static void getPlayerInput(){
        Scanner playerInputScanner = new Scanner(System.in);

        String playerInputLetter = playerInputScanner.nextLine();

        System.out.println(playerInputLetter);
    }
}
