package com.example.schoolManagementSystem.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Data
@Setter
@Getter
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int phone;
    private String Specialization;
    private int age;
    private boolean isActive;
    @OneToOne
    Course course;
}