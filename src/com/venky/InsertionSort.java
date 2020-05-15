package com.venky;

/**
 * I call this pick and Insert Sort Algorithm
 */
public class InsertionSort {

    public static int[] sort(int[] a) {
        for (int i=1; i<a.length; i++) {
            int value = a[i];
            int j = i-1;
            while (j>=0 && a[j] > value) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = value;
        }
        return a;
    }
}
