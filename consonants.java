package javaPractice;

import java.util.Scanner;

public class consonants {
    public static void main(String[] args) {
//ask user to enter a sentence

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        char[] letters = sentence.toCharArray();
        int count =0;
        for (int i = 0; i < letters.length; i++){
           if (isConsonant(letters[i])) {
               count++;
               letters[i] = '*';
           }

        }
            System.out.println(count);
            System.out.println(String.valueOf(letters));

    }
    public static boolean isConsonant(char c) {
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        for (char consonant :consonants) {
            if (c == consonant || c == Character.toUpperCase(consonant)) {
                return true;
            }
        }

        return false;
    }

}