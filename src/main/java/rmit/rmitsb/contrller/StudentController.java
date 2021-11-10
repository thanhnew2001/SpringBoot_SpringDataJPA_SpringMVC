package rmit.rmitsb.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Student;
import rmit.rmitsb.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(path = "/students", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
         studentService.saveStudent(student);
    }

    @RequestMapping(path = "/students", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @RequestMapping(path = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable(value = "id") Long id){
        studentService.deleteStudent(id);
    }

    @RequestMapping(path = "/students/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable(value = "id") Long id){
        return studentService.getStudent(id);
    }
}
