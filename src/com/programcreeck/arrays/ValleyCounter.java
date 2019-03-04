package com.programcreeck.arrays;

/**
 * Created by gabriele on 16/09/18.
 */
public class ValleyCounter {

    static int countValleys(int n, String s) {

        int level = 0;
        char[] path = s.toCharArray();
        boolean isInValley = false;
        int countValley = 0;
        for(char c : path) {
            if (c == 'U') {
                level++;
            } else if (c == 'D') {
                level--;
            }
            if (level < 0) {
                isInValley = true;
            } else if (level > 0) {
                isInValley = false;
            } else {
                if (isInValley) {
                    countValley++;
                }
            }

        }
        return countValley;
    }

    public static void main(String... args) {
        int n = 8;
        String s = "UDDDUDUU";

        System.out.println(countValleys(n, s));
    }
}
