package com.JavaCollections;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2,60);
        System.out.println(list);
        //[10, 20, 60, 30, 40, 50]
        //Beech me frequently insert/delete
    }
}
