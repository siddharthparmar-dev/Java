package com.Multithreading;

import java.util.Scanner;
/*
means: "Alpha class is becoming a Thread"
or
"Alpha class inherits properties of Thread class"
 */
class Alpha extends Thread {
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

}
class Beta{
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
}
class Gamma{
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
        Beta b = new Beta();
        Gamma g = new Gamma();

        a.registration();
        b.courseInfo();
        g.printingStars();
    }
}
