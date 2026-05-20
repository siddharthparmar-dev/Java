package com.Enum;
enum Result{
    PASS,FAIL,NR;

    int marks;
    Result(){
        System.out.println("Constructor of enum");
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
}
public class Enums3 {
    public static void main(String[] args) {
    Result result = Result.PASS;
    result.setMarks(100);
    System.out.println(result.getMarks());
}
}
