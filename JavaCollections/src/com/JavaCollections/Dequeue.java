package com.JavaCollections;

import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque  ad = new ArrayDeque();
        ad.add(100);
        ad.add(200);
        System.out.println(ad);  //[100, 200]
        ad.add(300);
        System.out.println(ad);  //[100, 200, 300]
        ad.addFirst(400);
        System.out.println(ad);   //[400, 100, 200, 300]


        /*
            🔷 Deque kya hota hai?

            Deque = Double Ended Queue

            👉 Dono side se add/remove kar sakte ho
            👉 Front se bhi
            👉 Rear se bhi

            Isliye ye:

            Queue bhi ban sakta hai (FIFO)

            Stack bhi ban sakta hai (LIFO)
         */
    }
}
