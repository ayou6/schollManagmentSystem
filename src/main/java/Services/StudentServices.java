package Services;

import Model.Student;
import Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student){ return studentRepository.save(student);}

}
