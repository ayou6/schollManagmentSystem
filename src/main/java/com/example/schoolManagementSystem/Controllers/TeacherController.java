package com.example.schoolManagementSystem.Controllers;
import com.example.schoolManagementSystem.Model.Teacher;
import com.example.schoolManagementSystem.Services.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "teacher")
public class TeacherController {
    @Autowired
    TeacherServices teacherServices;

    @GetMapping("/getAll")
    public List<Teacher> getAllTeachers() {
        return teacherServices.getAllTeachers();
    }//localhost:8080/teacher/getAll

    @GetMapping("{id}")
    public Teacher getById(@PathVariable("id") Long id) {
        return teacherServices.getById(id);
    } // localhost:8080/teacher/1

    @PostMapping("/addTeachers")
    public Teacher addTeachers(@RequestBody Teacher teacher) {
        return teacherServices.addTeacher(teacher);
    }


    @PutMapping("/teacher/{id}")
    public Teacher updateTeachers (@RequestBody Teacher teacher, @PathVariable Long id) {
        Teacher newTeacher = teacherServices.getById(id);
        newTeacher.setName(teacher.getName());
        return teacherServices.updateTeacher(newTeacher,id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTeacher (@RequestBody Teacher teacher, @PathVariable Long id){
        return teacherServices.deleteTeacher(id);
    }
}
