package de.scalese.springboot.collegemanagementsystem.dao;

import de.scalese.springboot.collegemanagementsystem.entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> findAll();

	public Student findById(int id);

	public Student save(Student student);
}
