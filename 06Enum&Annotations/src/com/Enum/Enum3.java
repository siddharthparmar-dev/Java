package com.Enum;

class Animal{

    public void animalUsuallyHuntsAndEats(){
        System.out.println("Animal is eating.......");
    }
}
//child class
class Tiger extends Animal{
    //override
    @Override    //meta data tag //giving message to java compiler that this method is overriden
    public void animalUsuallyHuntsAndEats(){
        System.out.println("tiger fearlesly hunts and eats");
    }
}
public class Enum3 {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.animalUsuallyHuntsAndEats();
    }
}
