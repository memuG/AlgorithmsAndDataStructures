package com.przemo.datastructures;

import com.przemo.IShow;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueShow implements IShow {
    static class PQSort implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    @Override
    public String toString() {
        int[] ia = {1, 5, 3, 7, 6, 9, 8};
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        for (int x : ia) {
            pq1.offer(x);
        }
        for (int x : ia) {
            System.out.println(pq1.poll() + " ");
        }

        PriorityQueue<Integer> pqs = new PriorityQueue<>(new PQSort());
        for (int x : ia) {
            pqs.offer(x);
        }
        System.out.println("size: " + pqs.size());
        System.out.println("peek: " + pqs.peek());
        System.out.println("size: " + pqs.size());
        System.out.println("poll: " + pqs.poll());
        System.out.println("size: " + pqs.size());

        return "PriorityQueue -> " + pq1.toString() + " PriorityQueue comparator -> " + pqs.toString();
    }
}
