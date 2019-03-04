package com.programcreeck.arrays;

/**
 * Created by gabriele on 19/09/18.
 */
public class CountingLetters {


    static long repeatedString(String s, long n) {

        long strLen = (long)s.length();

        long multiplier = n / strLen;

        long count = ((s.split("a", -1).length) - 1) * multiplier;

        long reminder = n % strLen;
        count += ((s.substring(0,(int)reminder).split("a", -1).length) -1);

        return count;
    }



    public static void main(String... args) {

        String s = "a";
        long n = 1000000000000L;

        long out = repeatedString(s, n);

        System.out.println(out);
    }
}
