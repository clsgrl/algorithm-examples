package com.examples.sort;

import java.util.Arrays;

/**
 * Created by gabriele on 25/10/18.
 */
public class BubbleSort {

    static void sort(int[] q) {

        int swap = 0;
        for (int i = 0; i < q.length; i++) {
            for (int j= i; j<q.length; j++) {
                if (q[j] < q[i]) {
                    int tmp = q[i];
                    q[i] = q[j];
                    q[j] = tmp;
                    swap++;
                }
            }
        }
        System.out.println("num of swaps= " + swap);
    }


    public static void main(String... args) {

        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};

        sort(q);

        System.out.println(Arrays.toString(q));
    }
}
