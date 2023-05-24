package com.example.schoolManagementSystem.Services;

import com.example.schoolManagementSystem.Model.Course;
import com.example.schoolManagementSystem.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServices {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public Course getByID(Long id) {
        return courseRepository.findById(id).get();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
