package com.OOPs;

public class SystemDesign implements ICourse{
    @Override
    public boolean registerCourse() {
        System.out.println("Enrolled to system design course");
        return false;
    }
}
