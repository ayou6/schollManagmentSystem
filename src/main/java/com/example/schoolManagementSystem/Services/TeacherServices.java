package com.example.schoolManagementSystem.Services;

import com.example.schoolManagementSystem.Model.Teacher;
import com.example.schoolManagementSystem.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServices {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher (Teacher teacher , Long id){
        teacher.setId(id);
        return teacherRepository.save(teacher);
    }

    public void deleteClass(Long id) { teacherRepository.deleteById(id);}

}
