package Controllers;

import Model.Teacher;
import Services.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "teacher")
public class TeacherController {
    @Autowired
    TeacherServices teacherServices;
    @GetMapping("/getAll")
    public List<Teacher> getAllTeachers(){
        return teacherServices.getAllTeachers();
    }
    @GetMapping("{id}")
    public Teacher getById(@PathVariable("id") Long id){
        return  teacherServices.getById(id);}

}
