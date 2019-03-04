package com.programcreeck.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gabriele on 28/10/18.
 */
public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> m1 = new HashMap<>();
        Map<Long, Long> m2 = new HashMap<>();
        Long count = 0L;

        for(Long k : arr) {
            if (m2.containsKey(k)) {
                count += m2.get(k);
            }
            if (m1.containsKey(k)) {
                if (m2.containsKey(k*r)) {
                    Long v = m2.get(k*r);
                    v += m1.get(k);
                    m2.put(k*r, v);
                }
                else{
                    m2.put(k*r, m1.get(k));
                }
            }
            if (m1.containsKey(k*r)) {
                Long v = m1.get(k*r);
                v++;
                m1.put(k*r, v);
            } else {
                m1.put(k*r, 1L);
            }

        }

        return count;
    }

    static long countTriplets2(List<Long> arr, long r) {

        Map<Long, Long> v2 = new HashMap<>();
        Map<Long, Long> v3 = new HashMap<>();
        Long count = 0L;
        for (Long k : arr) {
            count += v3.get(k) == null? 0 : v3.get(k);
            if (v2.get(k)!=null)
                v3.compute(k*r,(key,value)->value!=null?value+v2.get(k):v2.get(k));
            v2.compute(k*r,(key,value)->value==null?1:value+1);
        }
        return count;
    }

    public static void main(String... args) {

        int r = 2;
        //expects 2: (0, 1, 2); (0, 2, 3)
        List<Long> arr = Arrays.asList(1L, 2L, 2L, 4L);

        System.out.println(countTriplets(arr, r));

        int r1 = 3;
        //expects 6: (0, 1, 2); (0, 1, 3); (1, 2, 4); (1,3,4); (2, 4, 5); (3, 4, 5)
        List<Long> arr1 = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);

        System.out.println(countTriplets(arr1, r1));

    }
}
