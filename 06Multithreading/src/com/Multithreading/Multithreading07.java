package com.Multithreading;
class Jupiter implements Runnable{
    @Override
    public void run() {
        System.out.println("Task for new thread");
    }
}
public class Multithreading07 {
    public static void main(String[] args) {
//        Jupiter j = new Jupiter();
//        Thread t1 = new Thread(j);
//        t1.start();

        // we can do like this also
        //Thread t1 = new Thread(new Jupiter());

        //Anonymous inner class
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Task for new thread");
//            }
//        };
//        Thread t1 = new Thread(r);
//

        Runnable r = ()-> System.out.println("Task for my new thread");
        Thread t1 = new Thread(r);
        t1.start();

        Thread t = new Thread(()-> System.out.println("hello"));
        t.start();

        // whenever you are using refernce variable once to run single method once
        // then no need to crerate the referemnce variable

        new Thread(()-> System.out.println("hello")).start();

        new Thread(()-> {
            System.out.println("hello from thread2");
        }).start();

    }
}
