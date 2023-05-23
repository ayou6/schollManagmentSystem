package Services;

import Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClassServices {
    @Autowired
    ClassRepository classRepository;

    public List<Class> getAllClasses(){
        return classRepository.findAll();
    }
    public Class getById(Long id){
        return classRepository.findById(id).get();
    }


}

