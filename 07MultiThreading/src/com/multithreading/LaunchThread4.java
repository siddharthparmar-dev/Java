package com.multithreading;
import java.util.Scanner;


class Telusko implements Runnable
{

	@Override
	public void run()
	{
		String threadName=Thread.currentThread().getName();
		if(threadName.equals("REG"))
		{
			registration();
		}
		else if(threadName.equals("COURSE"))
		{
			courseInfo();
		}
		else
		{
			printingStars();
		}
		
	}
	
	public void registration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("id :"+id +" age :" +age);
	}
	
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
	
}
public class LaunchThread4
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread started");
		Telusko telusko=new Telusko();
		
		Thread t1=new Thread(telusko);
		Thread t2=new Thread(telusko);
		Thread t3=new Thread(telusko);
		
		t1.setName("REG");
		t2.setName("COURSE");
		t3.setName("STAR");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main Thread completed its task");

		
	}

}
