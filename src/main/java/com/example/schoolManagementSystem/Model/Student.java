package com.example.schoolManagementSystem.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@Setter
@Getter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private int age;
    private String email;
    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;
    @OneToMany
    List<StudentCourses> studentCourses;
}
