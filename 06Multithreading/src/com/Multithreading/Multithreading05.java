package com.Multithreading;

import java.util.Scanner;

class Delta implements Runnable {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run()
    {
        String Name = Thread.currentThread().getName();
        if (Name.equals("Reg")){
            registration();
        }
        else if (Name.equals("Courses")){
            courseInfo();
        }
        else {
            printingStars();
        }
    }
    public void registration()
    {
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
public class Multithreading05 {
    public static void main(String[] args) {
        Delta delta = new Delta();
        Thread t1 =  new Thread(delta);
        Thread t2 =  new Thread(delta);
        Thread t3 =  new Thread(delta);

        t1.setName("Reg");
        t2.setName("Courses");
        t3.setName("Stars");

        t1.start();
        t2.start();
        t3.start();

    }
}
