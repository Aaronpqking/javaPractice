package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lastLetterCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] result = sentence.split(" ");
        int count = 0;
        Map<Character, Integer> reverse = new HashMap<Character, Integer>();
        for (int i = 0; i < result.length; i++ ) {
            char lastLetter = result[i].charAt(result[i].length() - 1);
            if (lastLetter == 'y') {
                count++;
                if (!reverse.containsKey('y')) {
                    reverse.put('y', i);
                }
            }
            if (lastLetter == 's') {
                count++;
                if (!reverse.containsKey('s')) {
                    reverse.put('s', i);
                }
            }
        }
        String temp = result[reverse.get('s')];
        result[reverse.get('s')] = result[reverse.get('y')];
        result[reverse.get('y')] = temp;
        String endResult = String.join( " ", result);
        System.out.println(" There are " + count + " words that match the criteria");
        System.out.println(endResult);

            }

        }



