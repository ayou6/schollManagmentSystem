package com.example.schoolManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@Setter
@Getter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    Teacher teacher;
    @ManyToOne
    ClassRoom classRoom;
    @OneToMany
    List<StudentCourses> studentCourses;
}
