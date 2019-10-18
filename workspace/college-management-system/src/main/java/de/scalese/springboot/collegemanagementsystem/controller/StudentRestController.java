package de.scalese.springboot.collegemanagementsystem.controller;

import de.scalese.springboot.collegemanagementsystem.entity.Student;
import de.scalese.springboot.collegemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentService studentservice;

    @GetMapping("/students")
    List<Student> findAll() {
        return studentservice.findAll();
    }

}
