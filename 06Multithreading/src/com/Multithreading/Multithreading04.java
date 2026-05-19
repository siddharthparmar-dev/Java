package com.Multithreading;

import java.util.Scanner;

class Sigma{
    public void registration()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = scanner.nextInt();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("id " + id + " age " + age);
    }
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
}
public class Multithreading04 {
    public static void main(String[] args) {
        Sigma a = new Sigma();
        Thread t1 = new Thread(() -> {
            a.registration();
        });
        Thread t2 = new Thread(() -> {
            a.courseInfo();
        });
        Thread t3 = new Thread(() -> {
            a.printingStars();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
