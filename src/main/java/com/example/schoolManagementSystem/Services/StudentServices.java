package com.example.schoolManagementSystem.Services;

import com.example.schoolManagementSystem.Model.Student;
import com.example.schoolManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public ResponseEntity<Void> deleteStudent (Long id){
        studentRepository.deleteById(id);
        return ResponseEntity.noContent().build();    }

}
