package com.example.schoolManagementSystem.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Setter
@Getter
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classNo;
    @OneToMany
    List<Course> courses;

}