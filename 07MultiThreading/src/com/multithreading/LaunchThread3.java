package com.multithreading;
import java.util.Scanner;

class Alpha1 implements Runnable
{
	public void registration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("id :"+id +" age :" +age);
	}
	
	@Override
	public void run()
	{
		registration();
	}
	
}
	
class Beta1 implements Runnable
{
	public void courseInfo()
	{
		for(int i=0;i<5; i++)
		{
			System.out.println("Visit telusko.com for more courses");
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{	
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public void run()
	{
		courseInfo();
	}
}
class Gamma1 implements Runnable
{
	public void printingStars()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("* ");
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run()
	{
		printingStars();
	}
}
public class LaunchThread3
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread started");
		
		Alpha1 a=new Alpha1();
		Beta1 b=new Beta1();
		Gamma1 g=new Gamma1();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(g);
		System.out.println(t1.isAlive());//false
		System.out.println(t2.isAlive());//false
		System.out.println(t3.isAlive());//false
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());//true
		System.out.println(t2.isAlive());//true
		System.out.println(t3.isAlive());//true

		System.out.println("Main thread done with work");
	}

}

