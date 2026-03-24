package com.OOPs;

interface F1
{
    int add(int a,int b);
}

public class lambda2 {
    static void main(String[] args) {
        F1 func = (a,b)->a+b;
        F1 func2 = (a,b) ->
        {
            return a +b;
        };

        // when we use return in lambda then we have to put it inside the curly braces.
//        System.out.println(func.add(2,3));
    }
}
