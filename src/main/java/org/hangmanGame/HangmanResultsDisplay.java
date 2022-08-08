package org.hangmanGame;

public class HangmanResultsDisplay {

    public static String hiddenWord = "";

    public static void displayHiddenWord(){
        for(int wordLength = 0; wordLength < HangmanWord.hangmanWord.length(); wordLength++){
            hiddenWord += "_";
        }

        System.out.println(hiddenWord);
    }
}
