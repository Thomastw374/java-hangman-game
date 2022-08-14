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

//    Here you could write, if hangmanWord[i] equals letterGuess hiddenWord += letterGuess.
//    We could store the guesses in an array of size wordLength, check each entry like mentioned above.
//    Whenever hiddenWord is remade it will remember the previous guesses. So we need an array/list to hold all the guessed words.
//    But what about wrong answers? We will have checkGuess which is diff from displayHiddenWord (that's just the initial displayer)
//    Check guess will decrement a life variable. All of this can be ran in a for loop until either the

    public static void displayHiddenWord() {
        String[] hangmanWordArray = HangmanWord.hangmanWord.split("");
        hiddenWord = "" ;

        for (int wordLength = 0; wordLength < HangmanWord.hangmanWord.length(); wordLength++) {
            if (hangmanWordArray[wordLength].toLowerCase().equals(HangmanPlayerInput.playerInputLetter)) {
                hiddenWord += hangmanWordArray[wordLength];
            } else {
                hiddenWord += "_";
            }
            hiddenWord += " ";

        }

        System.out.println(hiddenWord);
    }
}

