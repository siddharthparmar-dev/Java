/*
========================================
        JAVA COLLECTION FRAMEWORK
========================================

Hierarchy:

Iterable
↑
Collection
├── List
├── Set
└── Queue
└── Deque

NOTE:
- Collection is an interface
- Collections is a utility class (different thing)
  */

import java.util.*;

public class CollectionFrameworkDemo {

    public static void main(String[] args) {

        /*
        ========================================
                    1️⃣ LIST
        ========================================
        ✔ Ordered
        ✔ Index based
        ✔ Duplicates allowed
        */

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10); // Duplicate allowed

        System.out.println("List: " + list);  
        // Output: [10, 20, 10]



        /*
        ========================================
                    2️⃣ SET
        ========================================
        ✔ No duplicates
        ✔ No guaranteed order (HashSet)
        */

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // Duplicate ignored

        System.out.println("HashSet: " + set);  
        // Output: [10, 20]



        /*
        ========================================
                2️⃣(a) SORTED SET
        ========================================
        ✔ No duplicates
        ✔ Sorted order maintained
        ✔ Implemented by TreeSet
        */

        Set<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(20);

        System.out.println("TreeSet (SortedSet): " + sortedSet);
        // Output: [10, 20, 30]



        /*
        ========================================
                    3️⃣ QUEUE
        ========================================
        ✔ FIFO (First In First Out)
        */

        Queue<Integer> queue = new LinkedList<>();

        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue before poll: " + queue);

        queue.poll(); // removes first element

        System.out.println("Queue after poll: " + queue);



        /*
        ========================================
                    4️⃣ DEQUE
        ========================================
        ✔ Double Ended Queue
        ✔ Can add/remove from both sides
        ✔ Can behave like Stack or Queue
        */

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);   // add at beginning
        deque.addLast(2);    // add at end
        deque.addFirst(0);

        System.out.println("Deque: " + deque);

        deque.removeLast();  // remove from end

        System.out.println("Deque after removeLast: " + deque);



        /*
        ========================================
                ITERATION (Common for all)
        ========================================
        */

        System.out.println("Iterating List:");
        for(Integer num : list) {
            System.out.println(num);
        }

    }
}