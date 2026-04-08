package com.collection;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(2);
        pQueue.add(78);
        pQueue.add(14);
        pQueue.add(86);
        pQueue.add(27);
        pQueue.add(196);
        pQueue.add(158);
        pQueue.add(235);

        System.out.println(pQueue);
        //[14, 27, 86, 78, 196, 158, 235]

        // some pre defined methods
        pQueue.offer(200);
        System.out.println(pQueue);
        pQueue.offer(89);
        System.out.println(pQueue);


        /*

            🧠 Important Concept (ye pakad le 🔥)

            👉 PriorityQueue sorted list nahi hoti hai
            👉 Ye internally Min Heap use karti hai

            Matlab:

            Sirf smallest element top pe guaranteed hota hai
            Baaki elements heap structure me hote hain (not fully sorted)

                25
              /    \
            50      75
           /  \    /   \
         150 100 125   175
         */
    }
}
