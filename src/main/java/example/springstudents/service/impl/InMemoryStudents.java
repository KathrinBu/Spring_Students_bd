package example.springstudents.service.impl;

import example.springstudents.model.Student;
import example.springstudents.repository.InMemoryDAO;
import example.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudents implements StudentService {
    private final InMemoryDAO repository;
    @Override
    public List<Student> findAllStudent() {
       return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
