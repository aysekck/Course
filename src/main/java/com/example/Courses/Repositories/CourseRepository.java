package com.example.Courses.Repositories;

import com.example.Courses.Model.Courses;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepository implements ICourseRepository{

    private List<Courses> courses;

    public CourseRepository() {
        this.courses = new ArrayList<>();
        this.courses.add(new Courses("Java Basic","Niveau 100"));
        this.courses.add(new Courses("Java Advance","Niveau 200"));
        //this.courses.add(new Courses( ));
    }

    @Override
    public List<Courses> getCourses() { return this.courses; }

    @Override
    public Courses saveBook(Courses courses) {
        this.courses.add(courses);
        return courses;
    }
}