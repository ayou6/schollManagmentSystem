package com.example.schoolManagementSystem.Responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class AddCourseResponse {
    private Long id;
    private String name;
    private String description;
    private String code;
    private boolean isActive;
    private Date createdDate;

    public AddCourseResponse(Long id, String name, String description, String code, boolean isActive, Date createdDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.isActive = isActive;
        this.createdDate = createdDate;
    }
}