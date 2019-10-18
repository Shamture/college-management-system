package de.scalese.springboot.collegemanagementsystem.dao;

import de.scalese.springboot.collegemanagementsystem.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDaoImp implements StudentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {

        // get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        Query<Student> query = session.createQuery("from Student", Student.class);

        List students = query.getResultList();

        return students;
    }
}
