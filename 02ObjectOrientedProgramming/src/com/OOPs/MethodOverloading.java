package com.OOPs;
class Calc{
    int add(int n1,int n2){
        int res = n1 + n2;
        return res;
    }

    // two functions can have same name if they have diffrent Number of parameters or diffrent type of parameters
    float add(float n1, float n2){
        float res = n1 + n2;
        return res;
    }
    int add(int n1,int n2,int n3){
        int res = n1 + n2 + n3;
        return res;
    }
    double add(double n1,double n2,double n3){
        double res = n1 + n2 + n3;
        return res;
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(124845845,154464554));
        /*
        1️⃣ Compile-Time Polymorphism
        Achieved using Method Overloading
        Decision made at compile time

        doesn't depends on return type so much
         */
    }
}
