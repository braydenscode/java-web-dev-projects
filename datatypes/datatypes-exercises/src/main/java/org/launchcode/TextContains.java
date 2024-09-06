package org.launchcode;

import java.util.Scanner;

public class TextContains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                " having nothing to do: once or twice she had peeped into the book her sister was reading, but it" +
                " had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without" +
                " pictures or conversation?’";

        System.out.println("What word would you like to search the sentence for? ");
        String word = input.nextLine().toLowerCase();
        String newSentence = sentence.replace(word, "");

        System.out.println("The sentence" + (sentence.toLowerCase().contains(word)?" does ":" doesn't ") + "contain: " + word);
        if (sentence.toLowerCase().contains(word)) {
            System.out.println("It first appears at index: " + sentence.toLowerCase().indexOf(word) + "\nWith a length of " + word.length() + " characters long.");
            System.out.println("Here is the sentence without your word.\n" + newSentence);
        }

        input.close();
    }
}
