package com.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class EH3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("kindly enter numerator to divide");
        int numerator = scan.nextInt();
        System.out.println("kindly enter denominator to divide");
        int denominator = scan.nextInt();
        int result = numerator / denominator;  //0 ArithematicException
        System.out.println("Result is : " + result);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size]; //NegativeArraySizeException
        System.out.println("Enter data to be inserted in array");
        int data = scan.nextInt();
        System.out.println("Enter index pos");
        int index = scan.nextInt();
        arr[index] = data; //ArrayIndexOutOfBoundException
        System.out.println(Arrays.toString(arr));
        }
        catch (ArithmeticException e){
            System.out.println("Kindly Enter non-zero Denominator");
        }
        catch (NegativeArraySizeException e){
            System.out.println("kindly enter positive value");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index pos is out of bound");
        }
        catch (Exception e){
            System.out.println("Wrong input exception handled");
        }
        System.out.println("Calc app terminated");
    }
}
