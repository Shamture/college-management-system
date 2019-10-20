package de.scalese.springboot.collegemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.scalese.springboot.collegemanagementsystem.entity.Student;
import de.scalese.springboot.collegemanagementsystem.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    // List all students
    //
    @GetMapping("/students")
    public List<Student> findAll() {

        return studentService.findAll();
    }

    // Get student by id
    //
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {

        Student student = studentService.findById(id);

        if (student == null) {
            throw new RuntimeException("Did not find student id: " + id);
        }

        return student;
    }

    // Add new student
    //
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {

        student.setId(0);
        studentService.save(student);

        return student;
    }

    // Update a student
    //
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {

        studentService.save(student);
        return student;
    }

    // Delete a student by id
    //
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {

        Student student = studentService.findById(id);

        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        studentService.delete(id);
    }
}
