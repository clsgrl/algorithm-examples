package com.programcreeck.arrays;

/**
 * Created by gabriele on 23/10/17.
 */
public class PatternMatcher {

    public static void main(String... args) {
        String txt = "THIS  IS A TEST TEXT";
        String pat = "TEST";

        char[] txtChars = txt.toCharArray();
        char[] patChars = pat.toCharArray();
        int N = txtChars.length;
        int M = patChars.length;

        for(int i = 0; i <= (N-M); i++ ) {
            int j;

            for(j = 0; j < M; j++) {
                if(txtChars[i+j]!=patChars[j]) {
                    break;
                }
            }
            if(j==M)
                System.out.println("Pattern found at "+i);
        }

    }
}
