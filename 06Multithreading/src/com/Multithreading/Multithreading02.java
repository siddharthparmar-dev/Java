package com.Multithreading;

import java.util.Scanner;

class Alpha{
    public void registration()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("id " + id + "age " + age);
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
public class Multithreading02 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.registration();
        a.courseInfo();
        a.printingStars();
    }
}
