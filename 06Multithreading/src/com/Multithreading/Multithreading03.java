package com.Multithreading;

import java.util.Scanner;

class Alpha1 implements Runnable {
    public void registration()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = scanner.nextInt();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("id " + id + " age " + age);
    }

    @Override
    public void run() {
        registration();
    }
}
class Beta1 implements Runnable {
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
class Gamma1 implements Runnable{
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
public class Multithreading03 {
    public static void main(String[] args) {
        Alpha1 a = new Alpha1();
        Beta1 b = new Beta1();
        Gamma1 g = new Gamma1();
        Thread thread1 = new Thread(a);
        // Runnable will not create thread
        //we will create thread using thread pre defined class
        // we have to pass a runnable task in argument of thread
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(g);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
