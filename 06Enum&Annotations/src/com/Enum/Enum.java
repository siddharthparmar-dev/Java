package com.Enum;
enum Week {
    MON,TUE,WED,THU,FRI,SAT,SUN
}
public class Enum {
    public static void main(String[] args) {
        Week week = Week.THU;
        System.out.println(week);
        int index = Week.THU.ordinal();
        System.out.println(index);
        //3
    }
}
// Enum (Enumeration)

// Enum Java me ek special class hoti hai jo fixed constants ka group define karti hai.
// Jab kisi variable ki limited values hoti hain tab enum use kiya jata hai.

// Example
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

// Usage
// Day d = Day.MONDAY;

// Advantages
// 1. Type safety provide karta hai
// 2. Code readable banata hai
// 3. Fixed constants define karne ke liye use hota hai

// Example uses
// Days of week
// Directions (NORTH, SOUTH, EAST, WEST)
// Status (SUCCESS, FAILED, PENDING)
