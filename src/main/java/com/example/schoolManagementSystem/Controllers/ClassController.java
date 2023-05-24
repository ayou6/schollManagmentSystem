package com.example.schoolManagementSystem.Controllers;

import com.example.schoolManagementSystem.Model.ClassRoom;
import com.example.schoolManagementSystem.Services.ClassServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "classroom")
public class ClassController {
    @Autowired
    ClassServices classServices;

    @GetMapping("/getAll")
    public List<ClassRoom> getAllClasses() {
        return classServices.getAllClasses();
    }

    @GetMapping("{id}")
    public ClassRoom getById(@PathVariable("id") Long id) {
        return classServices.getById(id);
    }

    @PostMapping("/addClasses")
    public ClassRoom addClasses(@RequestBody ClassRoom classroom) {
        return classServices.addClasses(classroom);
    }
}
