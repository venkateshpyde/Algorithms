package com.venky;

/**
 * Pivot-based Partition Algorithm
 */
public class QuickSort {

    public static int[] sort(int[] a) {
        sort(a, 0, a.length-1);
        return a;
    }

    public static void sort(int[] a, int start, int end) {
        if (start >= end) return;
        int pivotIndex = partition(a, start, end);
        sort(a, start, pivotIndex-1);
        sort(a, pivotIndex+1, end);
    }

    public static int partition(int[] a, int start, int end) {

        int pivot = a[end];
        int pIndex = start;

        for (int i=start; i<end; i++) {
            if (a[i] <= pivot) {
                SortingUtils.swap(a, i, pIndex);
                pIndex++;
            }
        }
        SortingUtils.swap(a, end, pIndex);
        return pIndex;
    }
}
