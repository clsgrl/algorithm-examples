package com.examples;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] A = {13,-3,-25, 20,-3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        int output = DivideAndConquer.findMaxCrossingSubArray(A, 4, 12, 8);

        System.out.println(output);
    }
}
