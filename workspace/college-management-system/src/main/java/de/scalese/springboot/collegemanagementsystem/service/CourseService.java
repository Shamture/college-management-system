package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.entity.Course;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;

import java.util.List;

public interface CourseService {

    public List<Course> findAll();

    public Course findById(int id);

    public void save(Course course);

    public void delete(int id);

    public Instructor findInstructor(int courseId);
}
