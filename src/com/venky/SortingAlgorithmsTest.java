package com.venky;

import java.util.*;

public class SortingAlgorithmsTest {
    public static void main(String[] args) {
        int[] input = {4,6,3,1,2,9,8,7,5};
        System.out.println("Bubble Sort - " + Arrays.toString(BubbleSort.sort(Arrays.copyOf(input, input.length))));
        System.out.println("Selection Sort - " + Arrays.toString(SelectionSort.sort(Arrays.copyOf(input, input.length))));
        System.out.println("Insertion Sort - " + Arrays.toString(InsertionSort.sort(Arrays.copyOf(input, input.length))));
        System.out.println("Merge Sort - " + Arrays.toString(MergeSort.sort(Arrays.copyOf(input, input.length))));
        System.out.println("Quick Sort - " + Arrays.toString(QuickSort.sort(Arrays.copyOf(input, input.length))));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(4,5);
        map.put(5,6);
        map.put(1,3);
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(5);

        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {

            System.out.println(iterator1.next());
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7); treeSet.add(3); treeSet.add(9);

        System.out.println(treeSet.last());
        System.out.println(treeSet.first());

        Iterator iterator2 = treeSet.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
        }

        List<Integer> list = new ArrayList<>();

    }
}
