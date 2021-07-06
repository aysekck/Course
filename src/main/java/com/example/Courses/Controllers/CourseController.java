package com.example.Courses.Controllers;

import com.example.Courses.Model.Courses;
import com.example.Courses.Repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseRepository courseRepository;

    @GetMapping("/single")
    public Courses getSingleCourse() {
        Courses courses = new Courses("Java Basics", "Niveau 100");
        return courses;
    }
    @GetMapping("/all")
    public List<Courses> getAllCourses() {
        return courseRepository.getCourses();
    }

    @PostMapping("/new")
    public Courses newCourse(@RequestBody Courses courses) {
        System.out.println(courses.toString());
        courseRepository.saveBook(courses);
        return courses;

    }
}

