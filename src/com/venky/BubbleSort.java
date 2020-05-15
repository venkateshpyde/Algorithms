package com.venky;

/**
 * Elements bubble up to their correct position in this algorithm
 */
public class BubbleSort {

    public static int[] sort(int[] a) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            {
                for (int i=0; i<a.length-1; i++) {
                    if (a[i] > a[i+1]) {
                        SortingUtils.swap(a, i, i+1);
                        sorted = false;
                    }
                }
            }
        }
        return a;
    }

}