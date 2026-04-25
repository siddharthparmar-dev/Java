package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer{
    int age;
    String name;
    double average;
    double strikeRate;

    public Cricketer() {

    }

    public Cricketer(int age, String name, double average, double strikeRate) {
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
}
class Alpha2 implements java.util.Comparator<Cricketer> {

    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        return (int) ((int) c1.strikeRate - c2.strikeRate);
    }
}
public class Comparator {
    public static void main(String[] args) {
        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(new Cricketer(15,"vaibhav suryavanshi",50.23,150));
        list.add(new Cricketer(38,"virat kohli",50.43,140));
        list.add(new Cricketer(22,"abhishek sharma",35.23,180));

        System.out.println(list);
        Alpha2 alpha2 = new Alpha2();


        System.out.println(list);
        Collections.sort(list,alpha2);
        // sort but on what basis?
        // earlier we have single data so we can easily sort but here we have multiple data
        // here comes the concept of comparable and comparartor

        // comparator ==> it has only one abstract method
        // comparator are used for these classes which we can't modify
        // we can use/access comarator using 3 ways 1. implements 2. anonymous inner class 3. Lambda


    }
}
