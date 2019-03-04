package com.programcreeck.arrays;

/**
 * Created by gabriele on 25/10/18.
 */
public class ArrayBribe {

    static void minimumBribes(int[] q) {

        int num = 0;

        for(int i = q.length -1; i>=0; i--) {
            if(q[i] - i - 1 > 2){
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) num++;
        }
        System.out.println(num);
    }

    public static void main(String... args) {

        int[] q = {2, 1, 5, 3, 4}; //expects 3
        int[] q1 = {2, 5, 1, 3, 4};  // expects too chaotic
        int[] q2 = {2, 1, 5, 4, 3}; // expects 4

        int[] q3 = {1, 2, 5, 3, 7, 8, 6, 4};

        minimumBribes(q);
        minimumBribes(q1);
        minimumBribes(q2);
        minimumBribes(q3);

    }
}
