package com.examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gabriele on 01/04/17.
 */
public class DivideAndConquer {

    public static int findMaxSubArray(int[] A, int low, int high) {
        if(low == high){
            return -1; //Arrays.asList(low, high, A[low]);
        }else{
            int mid = (high + low) / 2;
            int leftSum = findMaxSubArray(A, low, high);
            int rightSum = findMaxSubArray(A, low, high);
            int crossSum = findMaxCrossingSubArray(A,low, mid, high);
            if(leftSum >= rightSum && leftSum >= crossSum)
                return leftSum;
            else if(rightSum>=leftSum && rightSum >= crossSum)
                return rightSum;
            else return crossSum;
        }
    }



    public static int findMaxCrossingSubArray(int[] A, int low, int mid, int high) {

        int sum = 0;
        int leftSum = -100000;
        int maxLeft=0;
        int maxRigth=0;
        for( int i=mid ; i == low; i--) {
            sum += sum + A[i];
            if(sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int righSum = -100000;
        sum = 0;
        for(int i = mid+1; i == high; i++) {
            sum += sum + A[i];
            if(sum > righSum) {
                righSum = sum;
                maxRigth = i;
            }
        }

        List<Integer> output = Arrays.asList(maxLeft, maxRigth, leftSum + righSum);
        return leftSum + righSum;

    }



}
