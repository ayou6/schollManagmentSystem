package com.example.schoolManagementSystem.Services;
import com.example.schoolManagementSystem.Model.ClassRoom;
import com.example.schoolManagementSystem.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassServices {
    @Autowired
    ClassRepository classRepository;

    public List<ClassRoom> getAllClasses() {
        return classRepository.findAll();
    }

    public ClassRoom getById(Long id) {
        return classRepository.findById(id).get();
    }

    public ClassRoom addClasses(ClassRoom classroom) {
        return classRepository.save(classroom);
    }

    public ResponseEntity<Void> deleteClass(Long id) {
        classRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}

