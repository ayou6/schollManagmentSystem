package com.example.schoolManagementSystem.Controllers;

import com.example.schoolManagementSystem.Model.Student;
import com.example.schoolManagementSystem.Requests.AddStudentRequest;
import com.example.schoolManagementSystem.Responses.AddStudentResponse;
import com.example.schoolManagementSystem.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    public AddStudentResponse addStudent (@RequestBody AddStudentRequest studentRequest){

        Student savedStudent = studentServices.addStudent(studentRequest.convertToStudent());

        AddStudentResponse response = new AddStudentResponse(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getAge(),
                savedStudent.getGender(),
                savedStudent.getEmail(),
                savedStudent.getCreatedDate());
        return response;}

    @DeleteMapping("/delete/{id}")


    public ResponseEntity<Void> deleteStudent (@RequestBody Student student, @PathVariable Long id){
        return studentServices.deleteStudent(id);
    }
}

