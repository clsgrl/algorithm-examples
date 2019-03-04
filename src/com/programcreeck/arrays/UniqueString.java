package com.programcreeck.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gabriele on 25/10/17.
 */
public class UniqueString {

    public static void main(String... args) {
        String s = "abcdefghi";

        Set<Character> charSet = new HashSet<>();

        char[] chars = s.toCharArray();

        for(char c : chars) {
            if(!charSet.contains(c)){
                charSet.add(c);
            }else{
                System.out.println("found duplicated char");
                return;
            }
        }
        System.out.println("unique string");
    }
}
