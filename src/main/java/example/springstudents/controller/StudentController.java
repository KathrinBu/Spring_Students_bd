package example.springstudents.controller;

import example.springstudents.model.Student;
import example.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
      //todo
       return service.findAllStudent();
    }
    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }
    @PutMapping("/update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
