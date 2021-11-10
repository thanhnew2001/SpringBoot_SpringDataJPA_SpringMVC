package rmit.rmitsb.service;

import rmit.rmitsb.model.Student;

import java.util.List;

public interface StudentService {


    public void saveStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudent(Long id);

    public Student deleteStudent(Long id);


}
