package de.scalese.springboot.collegemanagementsystem.controller;

import de.scalese.springboot.collegemanagementsystem.entity.Course;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;
import de.scalese.springboot.collegemanagementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/courses/{id}/instructor")
    public Instructor getInstructor(@PathVariable int id) {
        return courseService.findInstructor(id);
    }
}
