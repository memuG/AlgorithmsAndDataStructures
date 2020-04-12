package com.przemo.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArraysShow {
    private List<Integer> arrayList = new ArrayList<>();
    private Vector<Integer> vec = new Vector<>();

    public String getNotes() {
        // vector grows 100% of its size - synchronized
        // ArrayList grows 50% of its size - not synchronized
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(16);
        arrayList.add(1, 89);
        arrayList.remove(0);
        arrayList.toArray();
        vec.add(2);
        vec.add(5);
        vec.add(1, 7);
        return this.toString();
    }

    @Override
    public String toString() {
        return "ArrayList -> " + arrayList.toString() + " Vector -> " + vec.toString();
    }

}