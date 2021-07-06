package com.example.Courses.Repositories;

import com.example.Courses.Model.Courses;

import java.util.List;

public interface ICourseRepository {
    List<Courses> getCourses();

    Courses saveBook(Courses courses);
}
