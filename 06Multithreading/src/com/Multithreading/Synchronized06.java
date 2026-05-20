package com.Multithreading;

class Car implements Runnable{
    @Override
    synchronized public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + "Has entered Parking lot");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Has entered into car driving seat");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Started to drive car");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Has came back and Parked the car");
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Synchronized06 {
    public static void main(String[] args) {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.setName("Siddharth ");
        t2.setName("Piyush ");
        t1.start();
        t2.start();
    }
}
