package com.ExceptionHandling;

import java.util.Scanner;
class InvalidCustomerException extends Exception{

}
class ATM{
    private int account_Number = 870075913;
    private int password = 2004;
    private int ac;
    private int pass;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly! Enter your account number :");
        ac = scanner.nextInt();
        System.out.println("Kindly! Enter your password :");
        pass = scanner.nextInt();
    }
    public void verify() throws InvalidCustomerException {
        if (ac == account_Number && pass == password){
            System.out.println("Collect your cash");
        }
        else {
            System.out.println("Invalid credentials");
            //InvalidCustomerException invalidCustomerException = new InvalidCustomerException();
            throw new InvalidCustomerException();
            //if he enters wrong credentials
//            input();
//            verify();
        }
    }
}
class Bank{
    public void intiate(){
        System.out.println("Banking application started");
        ATM atm = new ATM();
        try {
        atm.input();
        atm.verify();
        } catch (InvalidCustomerException e) {
            try {
                atm.input();
                atm.verify();
            } catch (InvalidCustomerException e1) {
                try {
                    atm.input();
                    atm.verify();
                } catch (InvalidCustomerException e2) {
                    System.out.println("you have been blocked for 24 hrs.");
                }
            }
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.intiate();
    }
}
