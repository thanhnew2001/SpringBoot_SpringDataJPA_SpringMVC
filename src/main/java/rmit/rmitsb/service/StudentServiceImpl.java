package rmit.rmitsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Student;
import rmit.rmitsb.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student){
        this.studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return this.studentRepository.findAll();
    }

    public Student getStudent(Long id){
        Student student = null;
        try {
            student = this.studentRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student deleteStudent(Long id){

        Student student = getStudent(id);
        this.studentRepository.delete(student);
        return student;
    }



}
