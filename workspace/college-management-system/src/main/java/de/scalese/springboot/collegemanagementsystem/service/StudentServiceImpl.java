package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.dao.StudentDao;
import de.scalese.springboot.collegemanagementsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentDao studentdao;

    @Override
    public List<Student> findAll() {
        return studentdao.findAll();
    }
}
