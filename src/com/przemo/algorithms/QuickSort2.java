package com.przemo.algorithms;

import com.przemo.IShow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort2 implements IShow {
    private static final Integer[] INPUT = new Integer[] { 1, 3, 4, 5, 8, 0, 6, 7, 2 };

    private static Integer[] quicksort(Integer[] array) {
        if (array.length < 2)
            return array;
        int pivot = array[0];
        List<Integer> smaller = new ArrayList<>();
        for (int i = 1; i < array.length; ++i)
            if (array[i] <=pivot)
                smaller.add(array[i]);
        List<Integer> greater = new ArrayList<>();
        for (int i = 1; i < array.length; ++i)
            if (array[i] > pivot)
                greater.add(array[i]);
        Integer[] result = new Integer[smaller.size() + 1 + greater.size()];
        int i = 0;
        for (int e: smaller) result[i++] = e;
        result[i] = pivot;
        for (int e: greater) result[++i] = e;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(INPUT));
        System.out.println(Arrays.toString(quicksort(INPUT)));
    }

    @Override
    public String getNotes() {
        return String.valueOf(quicksort(INPUT));
    }

}
