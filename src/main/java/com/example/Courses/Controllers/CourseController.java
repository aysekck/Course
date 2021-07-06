package com.example.Courses.Controllers;

import com.example.Courses.Model.Courses;
import com.example.Courses.Repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseRepository courseRepository;

    @GetMapping("single")
    public Courses getSingleCourse() {
        Courses courses = new Courses("Java Basics", "Niveau 100");
        return courses;
    }

}

