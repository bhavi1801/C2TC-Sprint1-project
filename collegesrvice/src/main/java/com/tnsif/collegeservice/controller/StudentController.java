package com.tnsif.collegeservice.controller;



import com.tnsif.collegeservice.entity.Student;
import com.tnsif.collegeservice.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.addStudent(student);
        @DeleteMapping("/{id}")
    public String deleteCollege(@PathVariable("id") int id) {
        StudentService.deleteStudent(id);
        return "Student with ID " + id + " deleted successfully!";
    }
}

    

