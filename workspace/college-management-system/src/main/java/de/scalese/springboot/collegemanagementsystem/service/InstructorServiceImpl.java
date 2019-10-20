package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.dao.InstructorRepository;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

		if (!result.isPresent()) {
			throw new RuntimeException("Did not find instructor id: " + id);
		}

		return result.get();
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
