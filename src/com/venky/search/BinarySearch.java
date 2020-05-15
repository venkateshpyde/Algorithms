package com.venky.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(iterativeSearch(a, 0, 8, 4));
    }

    public static int search(int[] a, int left, int right, int num) {

        if (right < left) return -1;

        int mid = (left+right)/2;

        if (a[mid] == num) {
            return mid;
        }

        if (a[mid] > num) {
            return search(a, left, mid - 1, num);
        }

        return search(a, mid + 1, right, num);
    }

    public static int iterativeSearch(int[] a, int left, int right, int num) {

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == num) {
                return mid;
            } else if (num > a[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}

