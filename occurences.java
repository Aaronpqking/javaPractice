package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class occurences {
    public static void main(String[] args) {
        int[] inputArray = {10,10,5,12,3,5};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : inputArray) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }
        }
        System.out.println(map);

    }
}