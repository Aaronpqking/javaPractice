package javaPractice;

import java.util.*;

public class traverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();


        char[] letters = word.toCharArray();
        Set<Character> map = new HashSet<Character>();

        for (char letter : letters) {
          map.add(letter);
        }
        System.out.println(map);

    }
}git remote

