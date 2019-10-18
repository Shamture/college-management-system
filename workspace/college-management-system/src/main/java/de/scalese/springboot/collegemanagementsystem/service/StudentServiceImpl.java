package de.scalese.springboot.collegemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.scalese.springboot.collegemanagementsystem.dao.StudentDao;
import de.scalese.springboot.collegemanagementsystem.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> findAll() {
    	
        return studentDao.findAll();
    }

	@Override
	public Student findById(int id) {
		
		return studentDao.findById(id);
	}

	@Override
	public Student save(Student student) {
		
		return studentDao.save(student);
	}
}
