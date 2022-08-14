package org.hangmanGame;

import java.util.ArrayList;
import java.util.List;

public class HangmanResultsDisplay {

    public static String hiddenWord = "";

    //
//    public HangmanResultsDisplay(String playerInputLetter) {
//        this.playerInputLetter = playerInputLetter;
//
//    }
    public static void checkGuess() {

    }

// For each letter in hangmanWord compare to each letter in the guessed letters. If none match, add an underscore to hidden word.
//    If one matches add that to hidden word. Could add it the letter to a variable, then if the variable is non zero etc. at the end
//    of the for loop. Act accordingly.

    public static void displayHiddenWord() {
        String[] hangmanWordArray = HangmanWord.hangmanWord.split("");
        hiddenWord = "";


        for (int wordLength = 0; wordLength < HangmanWord.hangmanWord.length(); wordLength++) {

            Boolean isAValidGuess = false;

            for (int guessNumber = 0; guessNumber < HangmanPlayerInput.playerInputLetter.size(); guessNumber++) {
                if (hangmanWordArray[wordLength].toLowerCase().equals(HangmanPlayerInput.playerInputLetter.get(guessNumber))) {
                    hiddenWord += hangmanWordArray[wordLength];
                    isAValidGuess = true;
                }
            }

            if (isAValidGuess == false) {
                hiddenWord += "_";
            }

            hiddenWord += " ";

        }

        System.out.println(hiddenWord);
    }
}

