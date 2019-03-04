package com.programcreeck.arrays;

import java.util.Map;
import java.util.HashMap;
/**
 * Created by gabriele on 20/10/17.
 *Given two strings s and t, determine if they are isomorphic.
 Two strings are isomorphic if the characters in s can be replaced to get t.
 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.
 Given "foo", "bar", return false.
 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.
 *
 */
public class IsomorphicStringFinder {

    public static void main(String... args) {
        String s = "paper";
        String t = "title";

        HashMap<Character, Character> isomorphicMap = new HashMap<>();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for(int i = 0; i<s.length(); i++) {
            Character sk = sChars[i];
            Character tk = tChars[i];
            if(isomorphicMap.containsKey(sk)) {
                if (!isomorphicMap.get(sk).equals(tk)) {
                    System.out.println("False");
                    return;
                }
            }
            else{
                if(isomorphicMap.containsValue(tk)){
                    System.out.println("False");
                    return;
                }
                isomorphicMap.put(sk, tk);
            }

        }

        System.out.println("True");

    }
}
