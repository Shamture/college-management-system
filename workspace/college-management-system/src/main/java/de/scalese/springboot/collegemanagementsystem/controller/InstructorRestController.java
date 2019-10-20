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
import de.scalese.springboot.collegemanagementsystem.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorRestController {

	@Autowired
	InstructorService instructorService;
	
	// get all instructors - findAll
	//
	@GetMapping("/instructors")
	public List<Instructor> findAll() {
		
		return instructorService.findAll();
	}
	
	// get instructor by id - findById
	//
	@GetMapping("/instructors/{id}")
	public Instructor getInstructor(@PathVariable int id) {
		return instructorService.findById(id);
	}
	
	// create an instructor - addInstructor
	//
	@PostMapping("/instructors")
	public Instructor addInstructor(@RequestBody Instructor instructor) {
		
		instructor.setId(0);
		instructorService.save(instructor);
		
		return instructor;
	}
	
	// update an instructor - updateInstructor
	//
	@PutMapping("/instructors")
	public Instructor updateInstructor() {
		return null;
	}
	
	// delete an instructor - deleteInstructor
	//
	@DeleteMapping("/instructor/{id}")
	public void deleteInstructor(@PathVariable int id) {
		
	}
	
	// get all courses from an instructor
	//
	@GetMapping("/instructors/{id}/courses")
	public List<Course> getCourses(@PathVariable int id) {
		return null;
	}
	
}
