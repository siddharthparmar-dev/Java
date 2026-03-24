package com.Enum;
enum Result{
    PASS,FAIL,NR;     //3 object will be created

    int marks;

    Result(){
        System.out.println("constructor if enum");
//        constructor if enum
//        constructor if enum
//        constructor if enum
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class Enum2 {
    public static void main(String[] args) {
        Result result = Result.NR;
        result.setMarks(44);
        System.out.println(result.getMarks());
        //44
        Result result1 = Result.FAIL;
        System.out.println(result1.getMarks());
        //0
        // Important concept
        //
        //Enum me har constant ek alag object hota hai.
        //Result
        //   |
        //   |---- PASS (marks = 0)
        //   |---- FAIL (marks = 0)
        //   |---- NR   (marks = 44)
    }
}
// Enum in Java

// Enum ek special class hoti hai jo fixed constants define karti hai.

// Example
//enum Result{
//    PASS, FAIL, NR;
//}

// Enum constants actually objects hote hain.
// Yaha 3 objects create honge: PASS, FAIL, NR

// Enum ka constructor har constant ke liye call hota hai.

// Enum objects directly new keyword se create nahi kiye ja sakte.
// Example:
// Result r = new Result();  // error

// Enum objects ke andar variables aur methods bhi ho sakte hain.