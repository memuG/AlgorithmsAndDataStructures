package com.przemo.datastructures;

import java.util.LinkedList;
import java.util.Queue;

import com.przemo.IShow;

public class QueueShow implements IShow {
    private Queue<Integer> q = new LinkedList<>();

    @Override
    public String toString() {
        q.offer(11);
        q.add(20);
        q.offer(33);
        System.out.println("q.poll()" + q.poll());
        q.add(42);
        System.out.println("q.peek() -> " + q.peek());
        return "q -> " + q.toString();
    }

}