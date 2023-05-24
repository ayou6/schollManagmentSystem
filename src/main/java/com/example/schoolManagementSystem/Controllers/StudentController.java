package com.example.schoolManagementSystem.Controllers;

import com.example.schoolManagementSystem.Model.Student;
import com.example.schoolManagementSystem.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }
    @GetMapping("{id}")
    public Student getById(@PathVariable ("id") Long id){
        return studentServices.getById(id);
    }

    @PostMapping("/addStudent")
    public Student addStudent (@RequestBody Student student){
        return studentServices.addStudent(student);
    }

}

