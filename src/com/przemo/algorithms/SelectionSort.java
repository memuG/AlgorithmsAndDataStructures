package com.przemo.algorithms;

import com.przemo.IShow;

import java.util.*;

public class SelectionSort implements IShow {
    private static final int[] INPUT = new int[] { 1, 3, 4, 5, 8, 0, 6, 7, 2 };

    private static int findSmallest(List<Integer> list) {
        int smallest = list.get(0), smallestIndex = 0;

        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] array){
        List<Integer> list = new LinkedList<>();
        for (int e: array) {
            list.add(e);
        }
        Stack<Integer> s = new Stack<>();

        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; ++i) {
            int smallest = findSmallest(list);
            newArr[i] = list.remove(smallest);
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(INPUT));
        System.out.println(Arrays.toString(selectionSort(INPUT)));
    }
}
