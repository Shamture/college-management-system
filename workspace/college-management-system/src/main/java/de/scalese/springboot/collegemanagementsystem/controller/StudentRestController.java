package de.scalese.springboot.collegemanagementsystem.controller;

import de.scalese.springboot.collegemanagementsystem.entity.Student;
import de.scalese.springboot.collegemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
    	return studentService.findById(id);
    }
    
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
    	return studentService.save(student);
    }
    
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
    	return studentService.save(student);
    }
    
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
    	
    }
}
