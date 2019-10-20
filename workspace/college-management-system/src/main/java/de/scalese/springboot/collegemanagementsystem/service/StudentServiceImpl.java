package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.dao.StudentRepository;
import de.scalese.springboot.collegemanagementsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

//	@Autowired
//	private StudentDao studentDao;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student findById(int id) {
		
		Optional<Student> result = studentRepository.findById(id);
		
		if (!result.isPresent()) {
			throw new RuntimeException("Did not find student id " + id);
		}
	
		return result.get();
	}

	@Override
	@Transactional
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	@Transactional
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}
