package com.przemo.algorithms;

import java.util.Arrays;

public class QuickSortShow {
    private static int[] INPUT = new int[] { 1, 3, 4, 5, 8, 6, 7, 2 };

    public int[] getInput() {
        return Arrays.copyOf(INPUT, INPUT.length);
    }

    public void setInput(int[] newInput) {
        INPUT = Arrays.copyOf(newInput, newInput.length);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    void swap(int[] arr, int i, int j) {
        int iElement = arr[i];
        arr[i] = arr[j];
        arr[j] = iElement;
    }

    public String getNotes() {
        quickSort(INPUT, 0, INPUT.length - 1);
        return Arrays.toString(INPUT);
    }
}
