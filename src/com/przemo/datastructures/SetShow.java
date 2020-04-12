package com.przemo.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.przemo.IShow;

public class SetShow implements IShow {
    private HashSet<Object> hs = new HashSet<>();
    private TreeSet<Object> ts = new TreeSet<>();
    private LinkedHashSet<Object> lhs = new LinkedHashSet<>();

    @Override
    public String toString() {
        boolean[] ba = new boolean[5];
        ba[0] = hs.add("a");
        ba[1] = hs.add(Integer.valueOf(42));
        ba[2] = hs.add("b");
        ba[3] = hs.add("a");
        ba[4] = hs.add(new Object());
        System.out.println(Arrays.toString(ba));

        lhs.add(4);
        lhs.add(4);
        lhs.add(1);
        lhs.add(45);
        lhs.add(9);
        lhs.add(41);

        ts.add(1);
        ts.add(51);
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(4);
        System.out.println("TreeSet headSet(4): " + ts.headSet(4));
        System.out.println("TreeSet tailSet(1): " + ts.tailSet(1));
        System.out.println("TreeSet subSet(3,5): " + ts.subSet(3, 5));

        return "HashSet -> " + hs.toString() + " LinkedHashSet ->" + lhs.toString() + " TreeSet ->" + ts.toString();
    }

}