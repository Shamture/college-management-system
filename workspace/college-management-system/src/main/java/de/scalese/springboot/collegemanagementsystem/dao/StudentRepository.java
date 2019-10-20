package de.scalese.springboot.collegemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.scalese.springboot.collegemanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
