package com.Enums_Annotations;
enum Laptop{
    Dell(45000),MacBook(49000),HP(52000),Asus(55000),Lenovo(48000);
    int price;

    Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
public class Enums2 {
    public static void main(String[] args) {
        System.out.println(Laptop.MacBook.getPrice());
    }
}
