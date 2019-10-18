package de.scalese.springboot.collegemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.scalese.springboot.collegemanagementsystem.entity.Student;

@Repository
public class StudentDaoImp implements StudentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {

        // get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        Query<Student> query = session.createQuery("from Student", Student.class);

        List<Student> students = query.getResultList();

        return students;
    }

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
