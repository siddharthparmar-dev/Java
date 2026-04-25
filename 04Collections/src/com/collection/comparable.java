package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
    int age;
    String name;
    double average;
    double strikeRate;

    public Cricketer1() {

    }

    public Cricketer1(int age, String name, double average, double strikeRate) {
        super();
        this.age = age;
        this.name = name;
        this.average = average;
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString() {
        return "Cricketer1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", average=" + average +
                ", strikeRate=" + strikeRate +
                '}';
    }

    @Override
    public int compareTo(Cricketer1 c1) {
//        if (this.average > c1.average)
//            return 1;                 //return -1 → “put me first”
//        else
//            return -1;                //return 1 → “put me later”
        return (int) (this.average - c1.average);
    }
}
public class comparable {
    public static void main(String[] args) {
        ArrayList<Cricketer1> list = new ArrayList<>();
        list.add(new Cricketer1(15,"vaibhav suryavanshi",50.23,150));
        list.add(new Cricketer1(38,"virat kohli",50.43,140));
        list.add(new Cricketer1(22,"abhishek sharma",35.23,180));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
