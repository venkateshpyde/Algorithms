package com.venky;

import java.util.Arrays;

/**
 * Divide until you get one and merge the sorted arrays
 */
public class MergeSort {

    public static int[] sort(int[] a) {
        mergeSort(a);
        return a;
    }

    public static void mergeSort(int[] a) {
        if (a.length < 2) return;
        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[a.length-mid];
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length-mid);
        mergeSort(left);
        mergeSort(right);
        mergeSortedArrays(left, right, a);
    }

    public static int[] mergeSortedArrays(int[] left, int[] right, int[] result) {
        int i=0, j=0, k=0;
        while (i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            result[k] = left[i];
            i++; k++;
        }
        while (j<right.length) {
            result[k] = right[j];
            j++; k++;
        }
        return result;
    }
}
