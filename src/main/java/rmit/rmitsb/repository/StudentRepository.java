package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
