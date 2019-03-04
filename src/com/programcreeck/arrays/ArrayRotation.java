package com.programcreeck.arrays;

import java.util.Arrays;

/**
 * Created by gabriele on 07/10/18.
 */
public class ArrayRotation {

    static int[] rotLeft(int[] a, int d) {

        int len = a.length;
        int[] out = new int[len];

        if (d == len)
            return a;
        else if(d < len) {
            int[] tmp0 = new int[d];
            int[] tmp1 = new int[len - d];
            for (int i = 0; i < a.length; i++) {
                if (i < d) {
                    tmp0[i] = a[i];
                } else {
                    tmp1[i - d] = a[i];
                }
            }
            System.arraycopy(tmp1, 0, out, 0, tmp1.length);
            System.arraycopy(tmp0, 0, out, tmp1.length, tmp0.length);
        }
        else
            throw new IllegalArgumentException();

        return out;
    }


    public static void main(String... args) {

        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        //expected result: 5 1 2 3 4

        int[] out = rotLeft(a, d);

        System.out.println(Arrays.toString(out));
    }
}
