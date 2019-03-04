package com.programcreeck.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gabriele on 16/09/18.
 */
public class SocksMerchant {

    static int sockMerchant(int n, int[] arr) {

        Map<Integer, Integer> pairMap = new HashMap<>();

        int nPair = 0;
        for(int i = 0; i< n; i++) {
            int colorCode = arr[i];
            if (pairMap.containsKey(colorCode)) {
                nPair++;
                pairMap.remove(colorCode);
            } else {
                pairMap.put(colorCode, 1);
            }
        }

        return nPair;
    }


    public static void main(String... args) {

        int nSocks = 10;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20, 20};

        int nPair = sockMerchant(nSocks, socks);

        System.out.println(nPair);
    }
}
