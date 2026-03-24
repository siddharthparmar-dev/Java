package com.OOPs;
//Functional interface
interface Alien1
{
    void disp();  //SAM single abstract method
}
class AliemImpl implements Alien1
{
    public void disp()
    {
        System.out.println("disp of alien implemented");
    }
}
public class lambda {
    public static void main(String[] args) {
        Alien1 func = new AliemImpl();
        func.disp();

//        Alien1 func2 = new Alien1(); // with semicolon it will give error, we cannot create object of an interface class
        Alien1 func2 = new Alien1()
        {
            public void disp(){
                System.out.println("without semicolon we can create object on interface class");
            }
        };
        func2.disp();
        // for creating object of interface class we have to remove semi colon and then create body of its methods


        // ( -> ) lambda operator in java
        /*
        lambda method:
        method unnamed
        anonymous method
        parameters
        body
        return type

        //lambda expression
        (parameters) -> (body)
        () -> {
            System.out.println("hello");
        }

        //lambda expression can be written if and only if there is single abstract method
         */

        Alien1 func3 = ()->
        {
                System.out.println("hello from lambda");
        };
        func3.disp();
        Alien1 func4 = ()-> System.out.println("hello from lambda");
        func4.disp();

        // we cannot write lambda expression seperately
        // we can only write when we are referring to functional interface
        // functional interface are those methods which have only single method
    }
}
