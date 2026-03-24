package com.JavaCollections;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(169);
        pq.add(178);
        pq.add(136);
        pq.add(124);
        pq.add(156);
        pq.add(74);
        pq.add(45);
        pq.add(175);

        System.out.println(pq);
        //[45, 74, 100, 124, 136, 178, 156, 169, 175]

        //priority queue follows minimum heap
        /*
                        45
                   /             \
                74               100
              /    \           /     \
            124     136      178      156
            /        \
           169       175

         */

        pq.offer(200);
        System.out.println(pq);
        //[45, 74, 100, 124, 136, 178, 156, 169, 175, 200]
        System.out.println(pq.peek());  //peek() → smallest return karega
        // 45
        System.out.println(pq.poll());  //poll() → smallest remove karega.
    }
}
