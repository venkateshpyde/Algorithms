package com.venky;

public class SortingUtils {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int minElementIndex(int[] a, int start) {
        int minIndex = start;
        for (int i=start+1; i<a.length; i++) {
            if (a[i]<a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
