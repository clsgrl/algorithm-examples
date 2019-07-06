package com.examples.arrays;

import java.util.Arrays;

/**
 * Created by gabriele on 17/03/19.
 */
public class FindMissing {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int i;
        for( i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]+1 || A[i] == A[i-1]) {
                continue;
            } else {
                return (A[i]-1)<0?1:(A[i]-1);
            }
        }

        if (A[A.length-1] < 0)
            return 1;
        else
            return (A[A.length-1]+1);
    }

    static int firstMissingPositive(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            while (A[i] != i + 1) {
                if (A[i] <= 0 || A[i] >= n)
                    break;

                if(A[i]==A[A[i]-1])
                    break;

                int temp = A[i];
                A[i] = A[temp - 1];
                A[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            if (A[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }

    static int solution2(int[] A) {
        int counter[] = new int[A.length];

        for (int i = 0; i < A.length; i++)
            if (A[i] > 0 && A[i] <= A.length)
                counter[A[i] - 1]++;

        for (int i = 0; i < counter.length; i++)
            if (counter[i] == 0)
                return i + 1;
        return A.length + 1;
    }

    public static void main(String... args) {

        int[] vec1 = {-1,-3};
        int[] vec2 = {1,2,3};
        int[] vec3 = {99,96, 98, 95, 98};

        int[] vec4 = {99,96, 98, 95, 98, -3, -2};

        System.out.println(solution(vec1));
        System.out.println(solution2(vec1));

        System.out.println(solution(vec2));
        System.out.println(solution2(vec2));

        System.out.println(solution(vec3));
        System.out.println(solution2(vec3));

        System.out.println(solution(vec4));
        System.out.println(solution2(vec4));

    }
}
