package com.collection;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(58);
        hashSet.add(45);
        hashSet.add(45);
        hashSet.add(71);
        hashSet.add(94);
        System.out.println(hashSet);
        //[71, 58, 45, 94]
    }
}
