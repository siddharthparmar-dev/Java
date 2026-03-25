package com.OOPs;
class Car{
    String name = "Hyundai i10";
    int model = 2005;

    Car(){
        System.out.println("Welcome");
    }

    void disp(String name,int model){
        System.out.println("Car name is " + this.name + " and model is " + this.model);
    }

}
public class OOP2 {
        public static void main(String[] args) {
           Car c = new Car();
           c.disp("Honda city",2009);
        }

}
