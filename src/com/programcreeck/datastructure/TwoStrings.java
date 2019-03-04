package com.programcreeck.datastructure;

import java.util.Arrays;

/**
 * Created by gabriele on 26/10/18.
 */
public class TwoStrings {


    static String twoStrings(String s1, String s2) {

        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";
    }


    public static void main(String... args) {

        String s1 = "hello";
        String s2 = "world";

        String s3 = "hi";
        String s4 = "world";
        int[] ivec = new int[2];

        System.out.println(twoStrings(s1, s2)); //expects YES

        System.out.println(twoStrings(s3, s4)); //expects NO

        System.out.println(Arrays.toString(ivec));
    }
}
