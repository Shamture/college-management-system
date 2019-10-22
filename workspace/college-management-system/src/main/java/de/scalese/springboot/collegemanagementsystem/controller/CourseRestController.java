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

import de.scalese.springboot.collegemanagementsystem.entity.Course;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;
import de.scalese.springboot.collegemanagementsystem.entity.Student;
import de.scalese.springboot.collegemanagementsystem.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseRestController {

    @Autowired
    private CourseService courseService;

    // get all courses
    //
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.findAll();
    }

    // get course by id
    //
    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id) {
        return courseService.findById(id);
    }

    // add a course
    //
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {

        course.setId(0);
        courseService.save(course);

        return course;
    }

    // update a course
    //
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
    	
        courseService.save(course);
        return course;
    }

    // delete a course
    //
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id) {
    	
        courseService.delete(id);
    }

    // get instructor from course
    //
    @GetMapping("/courses/{id}/instructors")
    public Instructor getInstructor(@PathVariable int id) {
    	
        return courseService.findInstructor(id);
    }
    
    // get students from course
    //
    @GetMapping("courses/{id}/students")
    public List<Student> getStudents(@PathVariable int id) {
    	
    	return courseService.findById(id).getStudents();
    }
    
    
    
}
