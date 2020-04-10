package com.przemo.Algorithms;

import java.util.Arrays;

public class InsertionSortShow {

    private static final int[] INPUT = new int[]{1, 3, 4, 5, 8, 6, 7, 2};

    private int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int selected = array[i];
            int sortedPointer = i - 1;
            while (sortedPointer >= 0 && array[sortedPointer] > selected) {
                array[sortedPointer + 1] = array[sortedPointer];
                sortedPointer -= 1;
            }
            array[sortedPointer + 1] = selected;
        }
        return array;
    }


    public String getNotes() {
        return Arrays.toString(insertionSort(INPUT));
    }
}
