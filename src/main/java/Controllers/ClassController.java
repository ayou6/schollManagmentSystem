package Controllers;

import Services.ClassServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "class")
public class ClassController {
    @Autowired
    ClassServices classServices;
    @GetMapping("/getAll")
    public List<Class> getAllClasses(){
        return classServices.getAllClasses();
    }
    @GetMapping("{id}")
    public Class getById(@PathVariable("id") Long id){
        return classServices.getById(id);
    }
    @PostMapping("/addClasses")
    public Class addClasses (@RequestBody Class class1){
        return classServices.addClasses(class1);
    }
}
