package org.hangmanGame;

public class HangmanGame {
    public static void main(String[] args) {

        HangmanWord.getRandomWord();
        System.out.println(HangmanWord.hangmanWord);

        HangmanResultsDisplay.displayHiddenWord();

        HangmanPlayerInput.getPlayerInput();

        HangmanResultsDisplay.displayHiddenWord();

        HangmanPlayerInput.getPlayerInput();

        HangmanResultsDisplay.displayHiddenWord();
    }
}