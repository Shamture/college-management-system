package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

	public Student findById(int id);

	public Student save(Student student);
   
}
