package com.example.schoolManagementSystem.Responses;
import com.example.schoolManagementSystem.Model.Student;
import lombok.*;


import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentResponse {
    private Long id;
    private String name;
    private String nationality;
    private Date createdDate;
}
