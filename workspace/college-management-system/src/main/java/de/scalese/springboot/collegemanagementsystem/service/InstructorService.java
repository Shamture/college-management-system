package de.scalese.springboot.collegemanagementsystem.service;

import java.util.List;

import de.scalese.springboot.collegemanagementsystem.entity.Instructor;

public interface InstructorService {

	public List<Instructor> findAll();

	public Instructor findById(int id);
	
	public void save(Instructor instructor);
	
	public void delete(int id);

}
