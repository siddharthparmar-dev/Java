package com.OOPs;
class Bike{
    private String brand;
    private double cost;

    static int count;

    {      // java init block
        count++;
    }

    Bike(){
//        count++;
    }
    Bike(String brand){
        this.brand = brand;
//        count++;
    }
    Bike(Double cost){
        this.cost = cost;
//        count++;
    }
}
public class JavaBlock {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        System.out.println(Bike.count);
        Bike b2 = new Bike("Harley");
        System.out.println(Bike.count);
        Bike b3 = new Bike(450000.00);
        System.out.println(Bike.count);
    }
}
