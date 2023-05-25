package com.example.schoolManagementSystem.Requests;

import com.example.schoolManagementSystem.Model.Course;
import com.example.schoolManagementSystem.Model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseRequest {
    private Long id;
    private String name;
    private String description;
    private String code;
    private boolean isActive;
    private Teacher teacher;

    public Course convertToCourse() {

    }
}