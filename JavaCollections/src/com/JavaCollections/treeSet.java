package com.JavaCollections;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(96);
        ts.add(104);
        ts.add(116);
        ts.add(124);
        ts.add(165);
        ts.add(175);
        System.out.println(ts);
        //[96, 100, 104, 116, 124, 165, 175]
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println("*******************************");
        System.out.println(ts.ceiling(116));
        System.out.println(ts.floor(104));
    }
}
/*
========================
TREESET - SHORT NOTES
========================

1) What is TreeSet?
- TreeSet is a Sorted Set in Java.
- It stores only unique elements (no duplicates).
- Elements are automatically stored in sorted (ascending) order.

2) Internal Working
- TreeSet internally uses a Red-Black Tree.
- Red-Black Tree is a self-balancing Binary Search Tree (BST).
- Because it is balanced, operations are efficient.

Time Complexity:
- Insert  -> O(log n)
- Delete  -> O(log n)
- Search  -> O(log n)

3) Binary Search Tree (BST) Rule
- Left child  <  Root  <  Right child
- Smaller values go to the left.
- Larger values go to the right.

4) Why TreeSet Output is Sorted?
- TreeSet follows Inorder Traversal.
- Inorder Traversal order:
  Left -> Root -> Right
- This always gives elements in ascending sorted order.

5) Balanced vs Skewed Tree
- A normal BST can become skewed (like a linked list).
- TreeSet avoids this using Red-Black Tree balancing.
- Height remains approximately log n.

6) TreeSet vs PriorityQueue

TreeSet:
- Fully sorted structure
- No duplicates allowed
- Uses Red-Black Tree
- Printing gives sorted order

PriorityQueue:
- Heap-based structure
- Duplicates allowed
- Only smallest element guaranteed at top
- Not fully sorted internally

========================
KEY POINTS
========================
- TreeSet = Sorted + Unique
- Internally uses Red-Black Tree
- Self-balancing
- Uses Inorder traversal
- All major operations are O(log n)
*/



