package com.collection;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(58);
        arrayList.add(75);
        arrayList.add(106);
        arrayList.add(1,56);  // we can insert element inside array list index based
        arrayList.add("hello");
        arrayList.add("python");
        arrayList.add("Java");
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(45);
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
    }
}
