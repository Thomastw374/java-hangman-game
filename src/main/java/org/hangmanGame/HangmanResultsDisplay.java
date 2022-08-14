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
        hiddenWord = "" ;

        for (int wordLength = 0; wordLength < HangmanWord.hangmanWord.length(); wordLength++) {
            for (int guessNumber = 0; guessNumber < HangmanPlayerInput.playerInputLetter.size(); guessNumber++){
                if (hangmanWordArray[wordLength].toLowerCase().equals(HangmanPlayerInput.playerInputLetter.get(guessNumber))) {
                    hiddenWord += hangmanWordArray[wordLength];
//                    set boolean to true
                }
            }
//            if boolean is true don't add underscore. Else add underscore.
//            Return boolean to false.
//            Can do something like an indexOf to see if the word even contains the letter, if not increment wrong guess count
//            end for loop in game class when guess count reaches 3. Add in hangman text art.

            hiddenWord += " ";

        }

        System.out.println(hiddenWord);
    }
}

