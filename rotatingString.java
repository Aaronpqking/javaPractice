package javaPractice;

import java.util.Scanner;

public class rotatingString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();
        System.out.println(word);

        String str1 = word.substring(0,2);
       String str2 = word.substring (2);


        System.out.println(str2 + str1);







    }
        }
    
