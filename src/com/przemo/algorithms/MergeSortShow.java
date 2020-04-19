package com.przemo.algorithms;

import com.przemo.IShow;

import java.util.Arrays;

public class MergeSortShow implements IShow {
    private static final int[] INPUT = new int[]{1, 3, 4, 5, 8, 6, 7, 2, 9};

    public void mergeSort(int[] a, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return;
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(a, lowIndex, midIndex);
            mergeSort(a, midIndex + 1, highIndex);
            merge(a, lowIndex, midIndex + 1, highIndex);
        }
    }

    int[] expected = {1, 2, 3, 4};
    int[] input = {3, 4, 1, 2};

    public int[] merge(int[] a, int lowIndex, int midIndex, int highIndex) {
        int counter = 0;
        int[] merged = new int[highIndex + 1];
        for (int i = lowIndex; i < midIndex; i++) {
            for (int j = midIndex; j <= highIndex; j++) {
                if (a[i] >= a[j]) {
                    merged[counter] = a[j];
                    j++;
                    // swap(a, i, j);
                } else {
                    merged[counter] = a[i];
                    i++;
                }
                counter++;
            }
        }
        return merged;
//        for (int i = 0; i < merged.length; i++) {
//            a[lowIndex + i] = merged[i];
//        }
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public String getNotes() {
        mergeSort(INPUT, 0, INPUT.length);
        return Arrays.toString(INPUT);
    }
}
