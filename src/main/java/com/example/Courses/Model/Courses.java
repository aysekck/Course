package com.example.Courses.Model;

public class Courses {
    private String courseID;
    private String courseName;
    private String courseInstructor;


    public Courses(String courseID, String courseName, String courseInstructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }

    public Courses() {

    }

    public Courses(String course_level, String course_name) {
    }


    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
}
