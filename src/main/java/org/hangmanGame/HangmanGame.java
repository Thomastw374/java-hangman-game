package org.hangmanGame;

public class HangmanGame {
    public static void main(String[] args) {

        HangmanWord.getRandomWord();
        System.out.println(HangmanWord.hangmanWord);

        HangmanResultsDisplay.displayHiddenWord();

        int wrongGuesses = 0;

        for (int gameRound = 0; wrongGuesses <= 3; gameRound++) {
            HangmanPlayerInput.getPlayerInput();

            HangmanResultsDisplay.displayHiddenWord();
        }
    }
}