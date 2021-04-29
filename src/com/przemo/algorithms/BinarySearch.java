package com.przemo.algorithms;

import com.przemo.IShow;

import java.util.Arrays;

public class BinarySearch implements IShow {
    private static final int[] INPUT = new int[] { 1, 3, 4, 5, 8, 6, 7, 2 };

    public static int binarySearch(int[] list, int item){
        // O(logn)?
        Arrays.sort(list);

        // O(logn) ?
        System.out.println(Arrays.toString(list));
        int low = 0, high = list.length-1;
        while (low <= high) {
            int mid = low + high;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(INPUT, 5));
    }

    @Override
    public String getNotes() {
        return String.valueOf(binarySearch(INPUT, 5));
    }

}
