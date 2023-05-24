package com.example.schoolManagementSystem.Controllers;

import com.example.schoolManagementSystem.Model.Course;
import com.example.schoolManagementSystem.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "course")
public class CourseController {
    @Autowired
    CourseServices courseServices;

    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseServices.getAllCourse();
    }

    @GetMapping("{id}")
    public Course getById(@PathVariable("id") Long id) {
        return courseServices.getByID(id);
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }


}

