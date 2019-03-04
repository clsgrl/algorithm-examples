package com.examples.stringmanipulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

/**
 * Created by gabriele on 25/01/19.
 */
public class ScherlockValidString {

    static String scherlockValidString(String s) {


        Map<Character, Integer> occurrences = new HashMap<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (occurrences.containsKey(c)) {
                int val = occurrences.get(c);
                occurrences.put(c, ++val);
            } else {
                occurrences.put(c, 1);
            }
        }

        String output;
        if (arr.length % occurrences.size() > 1) {
            output = "NO";
        } else {
            output = "YES";
        }

        return output;
    }


    public static void main(String... args) {

        System.out.println(5%3);

        String s = "aabbcd"; // {a: 2, b:2, c:1, d:1} 6%4 = 2
        String s2 = "abcdefghhgfedcba";
                    // {a:2, b:2, c:2, d:2, e:2, f:2, g:2, h:2} 16 % 8 = 0

        String s3 = "abcdefghhgfedcbahh";
        // {a:2, b:2, c:2, d:2, e:2, f:2, g:2, h:4} 18%8 = 2

        System.out.println(scherlockValidString(s));
        System.out.println(scherlockValidString(s2));
        System.out.println(scherlockValidString(s3));

        String s4 = "aabbccddeefghi";
        String s5 = "abcdefghhgfedecba";

        System.out.println(scherlockValidString(s4));
        System.out.println(scherlockValidString(s5));

        String s6 = "aabbc"; // {a : 2, b:2, c:1}
        System.out.println(scherlockValidString(s6));

        String s7 = "aabbccd"; // {a : 2, b:2, c:2, d: 1}
        System.out.println(scherlockValidString(s7));

        String s8 = "aabbccde"; // {a : 2, b:2, c:2, d: 1, e:1}
        System.out.println(scherlockValidString(s8));

    }
}
