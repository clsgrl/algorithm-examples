package com.programcreeck.arrays;

/**
 * Created by gabriele on 19/09/18.
 */
public class JumpingClouds {

    static int jumpingOnClouds2(int[] c) {

        int n = c.length;
        int minHop = 0;
        int i = 0;
        while (i < n - 2 ) {
            if (c[i+2] == 0) {
                i += 2;
                minHop++;
            } else if (c[i+1] == 0) {
                i++;
                minHop++;
            } else {
                i++;
            }
        }

        if (i == n - 2) {

        }

        return minHop;
    }

    static int jumpingOnClouds(int[] c) {
        int count = -1;
        int n = c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        return count;
    }

    public static void main(String... args) {

        //int n = 6;
        int[] c = {0, 0, 0, 1, 0, 0};

        int minHops = jumpingOnClouds(c);

        System.out.println(minHops);

    }
}
