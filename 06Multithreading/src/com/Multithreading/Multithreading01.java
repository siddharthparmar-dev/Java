package com.Multithreading;

public class Multithreading01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread started its work");
        Thread.sleep(6000);
        System.out.println("Thread finished its work");
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()); //Main
        System.out.println(t1.getPriority()); //5
        t1.setName("New Thread");
        t1.setPriority(4);
        System.out.println(t1.getName()); //New Thread
        System.out.println(t1.getPriority()); //4
    }
}
