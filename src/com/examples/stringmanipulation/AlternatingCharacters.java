package com.examples.stringmanipulation;

/**
 * Created by gabriele on 24/01/19.
 */
public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

        char[] arr = s.toCharArray();
        int counter = 0;
        char c = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (c == arr[i]) {
                counter++;
            }
            c = arr[i];
        }
        return counter;
    }


    public static void main(String... args) {

        String s1 = "AAAA";
        String s2 = "BBBBB";
        String s3 = "ABABABAB";
        String s4 = "BABABA";
        String s5 = "AAABBB";

        System.out.println(alternatingCharacters(s1));
        System.out.println(alternatingCharacters(s2));
        System.out.println(alternatingCharacters(s3));
        System.out.println(alternatingCharacters(s4));
        System.out.println(alternatingCharacters(s5));

    }
}
