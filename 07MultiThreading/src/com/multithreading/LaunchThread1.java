package com.multithreading;

public class LaunchThread1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Thread started its work");
		
		//Thread.sleep(6000);
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());//main
		System.out.println(t1.getPriority());//5
		System.out.println("*******************");
		t1.setName("Telusko");
		t1.setPriority(4);
		System.out.println(t1.getName());//Telusko
		System.out.println(t1.getPriority());//4
		
		System.out.println("Thread completed its work");
		
	}

}
