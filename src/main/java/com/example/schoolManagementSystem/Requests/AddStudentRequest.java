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
    private String name;
    private String nationality;

    public Student convertToStudent () {
        Date nowDate = new Date();
        Student student = new Student();
        student.setName(this.getName());
        student.setNationality(this.getNationality());
        student.setIsActive(true);
        student.setCreatedDate(nowDate);
        student.setUpdatedDate(nowDate);
        return student;
    }

}
