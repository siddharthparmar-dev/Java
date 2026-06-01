package com.Multithreading;

import java.util.Scanner;
/*
means: "Alpha class is becoming a Thread"
or
"Alpha class inherits properties of Thread class"
 */
class Alpha8 extends Thread {
    /*
Thread is a predefined Java class
Java already gives a class named: Thread
It contains things related to threads like:
start()
run()
sleep()
currentThread()
etc.
     */
    public void registration()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("id " + id + " age " + age);
    }

    @Override
    public void run() {
        registration();
    }
}
class Beta8 extends Thread {
    public void courseInfo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Visit website for more courses");
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        courseInfo();
    }
}
class Gamma8 extends Thread {
    public void printingStars() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" *");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        printingStars();
    }
}
public class Multithreading08 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        Alpha8 a = new Alpha8();
        Beta8 b = new Beta8();
        Gamma8 g = new Gamma8();
        a.start(); // to give life to new thread, we use start
        b.start();
        g.start();
        //join() current thread ko wait karwata hai jab tak target thread apna execution complete na kar le.
        a.join();
        b.join();
        g.join();
        System.out.println("Task After other threads work");
        System.out.println("Main thread done with work");
        //==> we dont have to invoke run method
//        a.registration();
//        b.courseInfo();
//        g.printingStars();
    }
}
