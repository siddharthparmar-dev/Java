package com.OOPs;

import java.util.Scanner;

class School{
    private int rollNo;
    private String name;
    private static int standard;
    private char section;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public static void setStandard(int std) {
        standard = std;
    }

    public static int getStandard(){
        return standard;
    }


    public char getSection() {
        return section;
    }

    public void setSection(char Section) {
        this.section = Section;
    }


    public  void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
abstract class ResultGenerator{
    public abstract double total();
    public abstract double calculatePercentage();
    public abstract String result();
    public abstract void displayResult();
}
class Result extends ResultGenerator{
    private School student;   //composition
    private int maths,science,english,hindi,socialScience;
    Result(School StudentDetails, int maths, int science, int english, int hindi, int socialScience){
        this.student = StudentDetails;
        this.english = english;
        this.maths = maths;
        this.hindi = hindi;
        this.science = science;
        this.socialScience = socialScience;
    }
    @Override
    public double total(){
         int totalMarks = maths + science + hindi + socialScience + english;
         return totalMarks;
    }
    @Override
    public double calculatePercentage() {
         double pecentage = (total() / 500.0) * 100.0;
         return pecentage;
    }

    @Override
    public String result() {
        return calculatePercentage() >= 33 ? "PASS" : "FAIL";
    }

    @Override
    public void displayResult() {
        System.out.println("Total Marks : " + total());
        System.out.println(student.getName() + " got " + calculatePercentage() + " % ");
        System.out.println("Result : " + result());
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Roll Number : ");
        int rollno = scan.nextInt();
        School.setStandard(9);
        if (rollno == 1){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! REPORT CARD !!!!!!!!!!!!!!!");
        School student1 = new School();
        student1.setName("Ajay");
        System.out.println("Name : " + student1.getName());
        student1.setRollNo(1);
        System.out.println("Roll no : " + student1.getRollNo());
        System.out.println("class : " + School.getStandard());
        student1.setSection('A');
        System.out.println("Section : " + student1.getSection());
        Result R1 = new Result(student1,89,56,78,84,65);
        R1.displayResult();
        System.out.println("***********************************************");
        }
        else if (rollno == 2) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! REPORT CARD !!!!!!!!!!!!!!!");
        School student2 = new School();
        student2.setName("Sid");
        System.out.println("Name : " + student2.getName());
        student2.setRollNo(2);
        System.out.println("Roll no : " + student2.getRollNo());
        System.out.println("class : " + School.getStandard());
        student2.setSection('B');
        System.out.println("Section : " + student2.getSection());
        Result R2 = new Result(student2,93,72,88,87,76);
        R2.displayResult();
        System.out.println("***********************************************");
        } else if (rollno  == 3) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! REPORT CARD !!!!!!!!!!!!!!!");
        School student3 = new School();
        student3.setName("Ravi");
        System.out.println("Name : " + student3.getName());
        student3.setRollNo(3);
        System.out.println("Roll no : " + student3.getRollNo());
        System.out.println("class : " + School.getStandard());
        student3.setSection('C');
        System.out.println("Section : " + student3.getSection());
        Result R3 = new Result(student3,21,24,41,49,29);
        R3.displayResult();
        System.out.println("***********************************************");
        }
        else {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! REPORT CARD !!!!!!!!!!!!!!!");
        School student4 = new School();
        student4.setName("Piyush");
        System.out.println("Name : " + student4.getName());
        student4.setRollNo(4);
        System.out.println("Roll no : " + student4.getRollNo());
        System.out.println("class : " + School.getStandard());
        student4.setSection('D');
        System.out.println("Section : " + student4.getSection());
        Result R4 = new Result(student4,78,81,76,89,91);
        R4.displayResult();
        System.out.println("***********************************************");
        }


    }
}
