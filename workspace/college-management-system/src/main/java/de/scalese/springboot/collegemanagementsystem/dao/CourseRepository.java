package de.scalese.springboot.collegemanagementsystem.dao;

import de.scalese.springboot.collegemanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Integer> {

}
