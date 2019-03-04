package com.examples.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gabriele on 22/01/19.
 */
public class AnagramRemover {

    public static int anagramRemove(String a, String b) {

        int[] lettercounts = new int[26];
        for(char c : a.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : b.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;

    }


    public static void main(String... args) {
        String a = "abc";
        String b = "cde";

        System.out.println(anagramRemove(a, b));
    }
}
