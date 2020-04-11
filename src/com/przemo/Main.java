package com.przemo;

import com.przemo.algorithms.InsertionSortShow;
import com.przemo.algorithms.QuickSortShow;
import com.przemo.datastructures.ArraysShow;
import com.przemo.datastructures.LinkedListShow;

public class Main {

    public static void main(String[] args) {
        // DataStructures
        System.out.println("Arrays: " + new ArraysShow().getNotes());
        System.out.println("LinkedList: " + new LinkedListShow().getNotes());
       // Algorithms
        System.out.println("InsertionSort: " + new InsertionSortShow().getNotes());
        System.out.println("QuickSort: " + new QuickSortShow().getNotes());
    }
}
