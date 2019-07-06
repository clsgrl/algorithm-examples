package com.examples.codility;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by gabriele on 17/03/19.
 */
public class HqlaxInterview {


    static int squareRoot(int A, int B) {


        int max = 0;
        for (int i = A; i <= B; i++) {
            int count = 0;
            double sqrti = Math.sqrt(i);

            while(sqrti%(int)sqrti==0 ) {
                sqrti = Math.sqrt(sqrti);
                count++;
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }



    static int neckles(int[] A) {


        int maxLen = 0;
        for (int i = 0; i < A.length; i++) {
            int curLen = 1;
            int current = i;
            while(current < A.length && A[current] != i) {
                curLen++;
                current = A[current];
            }

            if (maxLen < curLen) {
                maxLen = curLen;
            }
        }

        return maxLen;
    }

    static int optimization(int[] A ){
        int N = A.length;
        int result = 0;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
        return result;
    }

    static int optimizer(int[] A) {
        Map<Integer,Integer> arrMap = new HashMap<>();
        int distance = 0;
        for (int i = 0; i < A.length; i++) {
            if (arrMap.containsKey(A[i])){
                //int currDistance = arrMap.get(A[i]);
                //distance += Math.abs(currDistance-i);
                distance = Math.max(distance, Math.abs(arrMap.get(A[i])-i));
                arrMap.put(A[i],distance);
            }else {
                distance = 0;
                arrMap.put(A[i], 0);
            }
        }

        int max = 0;
        for (Object val : arrMap.values().toArray() ){
            int intVal = (int)val;
            if (intVal > max)
                max = intVal;
        }

        return max;
    }


    public static void main(String... args) {


        System.out.println(optimizer(new int[] {4,6,2,2,6,6,1}));

//        int A = 10;
//        int B = 20;
//
//        System.out.println(squareRoot(A, B));
//
//        System.out.println(squareRoot(6000, 7000));
//
//        System.out.println(squareRoot(9, 25));
//
//        System.out.println(squareRoot(2, 1000000000));


        //neckles(new int[] {5,4,0,3,1,6,2});


    }



}
