package com.OOPs;

public class Courses {

    private ICourse course;

    Courses(ICourse course)
    {
        this.course = course;
    }

    public boolean buyTheCourse()
    {
        return course.registerCourse();
    }
}
