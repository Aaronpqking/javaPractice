package javaPractice;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Vowels {
    public static void main(String[] args) {
//ask user to enter a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        //Count the number of variables in the sentence
       int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (isVowel(c)) { count++; }
        }
        // Display the count of vowels in the sentence            System.out.println("i = " + i);
        System.out.println("The sentence contains " + count + " vowels. ");        }

    public static boolean isVowel(char c) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (char vowel :vowels) {
        if (c == vowel || c == Character.toUpperCase(vowel)) {
            return true;
        }
    }

return false;
        }
        }