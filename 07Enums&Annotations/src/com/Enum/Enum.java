package com.Enum;
enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;  //Enum values are objects not normal string
}
public class Enum {
    public static void main(String[] args) {
        //Enums means fixed set of constants
        //fixed set of constants
        //eg: Days of a week
        // Months
        Week week = Week.THU;
        System.out.println(week); //THU
        int index = Week.THU.ordinal();
        System.out.println(index);  //3

        /*
        Enum provides:
        type safety
        fixed valid values
        clean code
         */
        Week[] weeks = Week.values();
        for (Week w : weeks) {
            System.out.println(w);
            /*
            MON
            TUE
            WED
            THU
            FRI
            SAT
            SUN
             */
        }
    }
}
