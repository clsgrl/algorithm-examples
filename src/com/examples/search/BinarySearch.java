package com.examples.search;

/**
 * Created by gabriele on 25/10/17.
 */
public class BinarySearch {

    // recursive binary search
    public int binarySearch(int[] arr, int start, int end, int value) {

        if(end>=start) {
            // assume end > start
            int mid = start + (end - start) / 2;
            if (arr[mid] == value)
                return mid;

            if (value > arr[mid]) {
                return binarySearch(arr, mid + 1, end, value);
            } else {
                return binarySearch(arr, start, mid - 1, value);

            }
        }
        return -1;
    }

    public static void main(String... args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}
