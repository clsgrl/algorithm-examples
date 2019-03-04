package com.examples.stringmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gabriele on 15/02/19.
 */
public class FindMissingValues {

    static int findMissing(Set<Integer> fullSet, Set<Integer> partialSet) {

        Integer[] fullSetArray = new Integer[fullSet.size()];
        Integer[] partialSetArray = new Integer[partialSet.size()];

        fullSet.toArray(fullSetArray);
        partialSet.toArray(partialSetArray);

        int xor_sum = 0;
        for (int num : fullSetArray) {
            xor_sum ^= num;
        }

        for (int num : partialSetArray) {
            xor_sum ^= num;
        }

        return xor_sum;
    }

    public static int myMathPow(int a, int b) {
        int pow = a;
        for (int i = 1; i < b; i++) {
            pow *= a;
        }

        return pow;
    }


    public static void main(String... args) {
        /**
         * [4, 12, 9, 5, 6]
         * [4, 9, 12, 6]
         *
         * returns 5
         * */
        Set<Integer> fullSet = new HashSet<>(Arrays.asList(4, 12, 9, 5, 6));
        Set<Integer> partialSet = new HashSet<>(Arrays.asList(4, 12, 9, 6));
        int xor_sum = findMissing(fullSet, partialSet);
        System.out.println(xor_sum);

        System.out.println(4 ^ 12 ^ 9 ^ 5 ^ 6 ^ 4 ^ 12 ^ 9 ^ 6);

        System.out.println(Math.pow(3, 4));

        System.out.println(myMathPow(3, 4));

        System.out.println(myMathPow(-2, 4));
    }
}
