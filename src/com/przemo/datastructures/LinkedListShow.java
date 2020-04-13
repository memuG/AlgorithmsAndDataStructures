package com.przemo.datastructures;

import java.util.LinkedList;

import com.przemo.IShow;

public class LinkedListShow implements IShow {

    LinkedList<Integer> ll = new LinkedList<>();

    @Override
    public String toString() {
        ll.add(10);
        ll.add(29);
        ll.add(30);
        ll.add(99);
        ll.add(2, 55);
        ll.get(1);
        ll.get(1);
        ll.pollLast();
        System.out.println(ll.peekFirst());
        ll.pop();
        ll.push(4);
        return "LinkedList -> " + ll;
    }

}