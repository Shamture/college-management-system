package de.scalese.springboot.collegemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.scalese.springboot.collegemanagementsystem.dao.InstructorRepository;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	InstructorRepository instructorRepository;

	@Override
	public List<Instructor> findAll() {

		return instructorRepository.findAll();
	}

	@Override
	public Instructor findById(int id) {

		Optional<Instructor> result = instructorRepository.findById(id);

		Instructor instructor = null;

		if (result.isPresent()) {
			instructor = result.get();
		} else {
			throw new RuntimeException("Instuctor not found with id: " + id);
		}

		return instructor;
	}

	@Override
	public void save(Instructor instructor) {
		instructorRepository.save(instructor);
	}

	@Override
	public void delete(int id) {
		instructorRepository.deleteById(id);

	}

}
