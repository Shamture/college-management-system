package de.scalese.springboot.collegemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.scalese.springboot.collegemanagementsystem.entity.Instructor;


public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
