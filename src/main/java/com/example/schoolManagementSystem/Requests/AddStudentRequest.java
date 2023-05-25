package com.example.schoolManagementSystem.Requests;

import com.example.schoolManagementSystem.Model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequest {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String email;

    public Student convertToStudent () {
        Date nowDate = new Date();
        Student student = new Student();
        student.setName(this.getName());
        student.setGender(this.getGender());
        student.setAge(this.getAge());
        student.setEmail(this.getEmail());
        student.setIsActive(true);
        student.setCreatedDate(nowDate);
        student.setUpdatedDate(nowDate);
        return student;
    }

}
