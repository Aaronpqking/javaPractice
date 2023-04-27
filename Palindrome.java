package javaPractice;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
//ask user to enter a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

    StringBuilder sb = new StringBuilder(word);
    String reversedStr = sb.reverse().toString();
System.out.println(word.equals(reversedStr));
}

    public boolean isPalindrome(String str) {
        int lo = 0;
        int hi = str.length() - 1;

        while(lo <= hi){
            if(str.charAt((lo)) != str.charAt((hi))){
                return false;
            }
        }
        return true;
    }
}
