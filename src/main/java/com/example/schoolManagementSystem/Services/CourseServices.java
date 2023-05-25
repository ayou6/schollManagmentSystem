package com.example.schoolManagementSystem.Services;

import com.example.schoolManagementSystem.Model.Course;
import com.example.schoolManagementSystem.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public Course editCourse (Course course,Long id){
        course.setId(id);
        return courseRepository.save(course);
    }
    public void deleteCourse(Long id) { courseRepository.deleteById(id);}
}
