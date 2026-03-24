package com.OOPs;
interface  Icourse
{
    String course(String name);
}
//this is a functional interface bcz its has only one abstract method.
//so we can implement it by using a lambda expression.
public class lambda3 {
public static void main(String[] args) {

    // we can implement lambda class 3 methods

    // first method

    Icourse course = (String name) -> {
        return "The duration of " + name + " is 5 months";
    };

    // second method

    Icourse course2 = new Icourse(){
        public String course (String name) {
            return "The duration of " + name + " is 5 months";
        }
    };

    // third method

    Icourse course3 = name -> "The duration of " + name + " is 5 months";

    // body is added , now we can pass lambda expression to a method

    // calling method:
    courseInfo(course3);

    //method:

}
    public static void courseInfo(Icourse course){
        System.out.println("Duration is " + course.course("Java"));
    }
}
